package com.dzdevsoft.f2f.services.contracts;

import com.dzdevsoft.f2f.entities.Influencer;
import java.security.Principal;
import java.util.UUID;

public interface InfluencerBusiness {

  Influencer getInfluencerById(UUID id) throws IllegalArgumentException;
  Influencer getPrincipal(Principal principal);
}