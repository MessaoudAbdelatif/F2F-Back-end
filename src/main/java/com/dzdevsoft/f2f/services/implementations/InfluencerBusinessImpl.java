package com.dzdevsoft.f2f.services.implementations;

import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.repositories.InfluencerDao;
import com.dzdevsoft.f2f.services.contracts.InfluencerBusiness;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class InfluencerBusinessImpl implements InfluencerBusiness {

  private final InfluencerDao influencerDao;

  public InfluencerBusinessImpl(InfluencerDao influencerDao) {
    this.influencerDao = influencerDao;
  }

  public Influencer getInfluencerByEmail(String email) {
    return influencerDao.findByEmail(email);
  }

}
