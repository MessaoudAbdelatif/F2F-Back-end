package com.dzdevsoft.f2f.services.contracts;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.entities.Deal;
import com.dzdevsoft.f2f.entities.Influencer;
import java.util.List;
import java.util.Optional;

public interface DealBusiness {

  Optional<List<Deal>> getDealsfromInfulencerDao(Influencer influencer);

  Optional<List<Deal>> getDealsfromCompanyDao(Company company);

  Deal createDeal(Deal deal);

  void deleteDeal(Long id);
}
