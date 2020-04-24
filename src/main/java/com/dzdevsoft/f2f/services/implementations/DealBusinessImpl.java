package com.dzdevsoft.f2f.services.implementations;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.entities.Deal;
import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.repositories.DealDao;
import com.dzdevsoft.f2f.services.contracts.DealBusiness;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class DealBusinessImpl implements DealBusiness {

  private DealDao dealDao;

  public DealBusinessImpl(DealDao dealDao) {
    this.dealDao = dealDao;
  }

  @Override
  public Optional<List<Deal>> getDealsfromInfulencerDao(Influencer influencer) {

    return dealDao.findByInfluencerOrderByCreatedDateDesc(influencer);
  }

  @Override
  public Optional<List<Deal>> getDealsfromCompanyDao(Company company) {
    return dealDao.findByCompanyOrderByCreatedDateDesc(company);
  }

  @Override
  public Deal createDeal(Deal deal) {
    dealDao.save(deal);
    return deal;
  }

  @Override
  public void deleteDeal(Long id) {
    dealDao.deleteById(id);
  }
}
