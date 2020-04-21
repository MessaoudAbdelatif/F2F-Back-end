package com.dzdevsoft.f2f.services.contracts;

import com.dzdevsoft.f2f.entities.Company;

public interface CompanyBusiness {

  Company getInfluencerByEmail(String email);

}
