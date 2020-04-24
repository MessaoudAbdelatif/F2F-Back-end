package com.dzdevsoft.f2f.controllers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers.DealMapper;
import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.DealDto;
import com.dzdevsoft.f2f.entities.Deal;
import com.dzdevsoft.f2f.services.contracts.CompanyBusiness;
import com.dzdevsoft.f2f.services.contracts.DealBusiness;
import com.dzdevsoft.f2f.services.contracts.InfluencerBusiness;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DealController {

  private final DealBusiness dealBusiness;
  private final DealMapper dealMapper;
  private final InfluencerBusiness influencerBusiness;
  private final CompanyBusiness companyBusiness;


  public DealController(DealBusiness dealBusiness,
      DealMapper dealMapper,
      InfluencerBusiness influencerBusiness,
      CompanyBusiness companyBusiness) {
    this.dealBusiness = dealBusiness;
    this.dealMapper = dealMapper;
    this.influencerBusiness = influencerBusiness;
    this.companyBusiness = companyBusiness;
  }

  @GetMapping("/api/v1/deals/influencer")
  public List<DealDto> getAllInfluencerDeals(Principal principal) {
    List<Deal> other = new ArrayList<>();
    List<DealDto> collect = (dealBusiness
        .getDealsfromInfulencerDao(influencerBusiness.getPrincipal(principal)).orElse(other))
        .stream()
        .map(dealMapper::toDealDtoInfluencer)
        .collect(Collectors.toList());

    collect.
        forEach(dealDto -> {
          dealDto.setReceiverName(
              companyBusiness.getCompanyById(dealDto.getReceiver()).getName());
          {
            dealDto.setImageProductPath(
                companyBusiness.getCompanyById(dealDto.getReceiver()).getLogoPath());
          }
        });
    return collect;
  }

  @GetMapping("/api/v1/deals/company")
  public List<DealDto> getAllCompanyDeals(Principal principal) {
    List<Deal> other = new ArrayList<>();
    List<DealDto> collect = (dealBusiness
        .getDealsfromCompanyDao(companyBusiness.getPrincipal(principal)).orElse(other))
        .stream()
        .map(dealMapper::toDealDtoCompany)
        .collect(Collectors.toList());
    collect.
        forEach(dealDto -> {
          dealDto.setReceiverName(
              influencerBusiness.getInfluencerById(dealDto.getReceiver()).getFirstName());
          {
            dealDto.setImageProductPath(
                influencerBusiness.getInfluencerById(dealDto.getReceiver()).getImagePath());
          }
        });
    return collect;
  }

  @PostMapping("/api/v1/deal/influencer")
  public DealDto createMessageFromInfluencer(@RequestBody DealDto dealDto,
      Principal principal) {

    Deal deal = dealMapper.toDealinfluencer(dealDto);

    deal.setCompany(companyBusiness
        .getCompanyById(dealDto.getReceiver()));
    deal
        .setInfluencer(influencerBusiness.getInfluencerById(UUID.fromString(principal.getName())));

    dealBusiness.createDeal(deal);
    return dealMapper.toDealDtoInfluencer(deal);
  }

  @PostMapping("/api/v1/deal/company")
  public DealDto createMessageForCompany(@RequestBody DealDto dealDto,
      Principal principal) {
    Deal deal = dealMapper.toDealCompany(dealDto);

    deal.setInfluencer(influencerBusiness
        .getInfluencerById(dealDto.getReceiver()));
    deal
        .setCompany(companyBusiness.getCompanyById(UUID.fromString(principal.getName())));

    dealBusiness.createDeal(deal);
    return dealMapper.toDealDtoCompany(deal);
  }

  @DeleteMapping("/api/v1/deal/{id}")
  public void deleteDeal(@PathVariable(value = "id") String id) {
    dealBusiness.deleteDeal(Long.valueOf(id));
  }
}
