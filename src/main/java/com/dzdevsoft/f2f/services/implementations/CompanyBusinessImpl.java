package com.dzdevsoft.f2f.services.implementations;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.repositories.CompanyDao;
import com.dzdevsoft.f2f.services.contracts.CompanyBusiness;
import java.security.Principal;
import java.util.UUID;
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

  public Company getCompanyById(UUID id) throws IllegalArgumentException {
    return companyDao.findById(id).orElseThrow(IllegalArgumentException::new);
  }

  public Company getPrincipal(Principal principal) {
    return getCompanyById(UUID.fromString(principal.getName()));
  }
}
