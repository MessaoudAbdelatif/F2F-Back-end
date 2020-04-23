package com.dzdevsoft.f2f.controllers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers.InfluencerMapper;
import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.InfluencerDto;
import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.repositories.InfluencerDao;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class InfluencerController {

  private final InfluencerDao influencerDao;
  private final InfluencerMapper influencerMapper;

  public InfluencerController(InfluencerDao influencerDao,
      InfluencerMapper influencerMapper) {
    this.influencerDao = influencerDao;
    this.influencerMapper = influencerMapper;
  }

  @GetMapping("/api/v1/influencers")
  public List<InfluencerDto> getAllInfluencer() {
    return influencerDao.findAll().stream().map(influencerMapper::toInfluencerDto).collect(
        Collectors.toList());
  }

  @PostMapping("/api/v1/influencer")
  public Influencer saveInfluencer(@RequestBody Influencer influencer) {
    influencerDao.save(influencer);
    return influencer;
  }
}
