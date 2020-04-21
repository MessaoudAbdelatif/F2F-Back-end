package com.dzdevsoft.f2f.services.implementations;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.repositories.CompanyDao;
import com.dzdevsoft.f2f.services.contracts.CompanyBusiness;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class CompanyBusinessImpl implements CompanyBusiness {

  private final CompanyDao companyDao;

  public CompanyBusinessImpl(CompanyDao companyDao) {
    this.companyDao = companyDao;
  }

  public Company getInfluencerByEmail(String email) {
    return companyDao.findByEmail(email);
  }
}
