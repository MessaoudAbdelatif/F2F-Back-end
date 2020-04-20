package com.dzdevsoft.f2f.controllers;

import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.repositories.InfluencerDao;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfluencerController {

  private final InfluencerDao influencerDao;

  public InfluencerController(InfluencerDao influencerDao) {
    this.influencerDao = influencerDao;
  }

  @GetMapping("/api/v1/influencers")
  public List<Influencer> getAllInfluencer() {
    return influencerDao.findAll();
  }
  @PostMapping("/api/v1/influencer")
  public Influencer saveInfluencer(@RequestBody Influencer influencer){
    influencerDao.save(influencer);
    return influencer;
  }
}