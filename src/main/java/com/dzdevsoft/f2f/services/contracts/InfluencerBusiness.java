package com.dzdevsoft.f2f.services.contracts;

import com.dzdevsoft.f2f.entities.Influencer;

public interface InfluencerBusiness {

  Influencer getInfluencerByEmail(String email);
}