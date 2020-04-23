package com.dzdevsoft.f2f.services.contracts;

import com.dzdevsoft.f2f.entities.Company;
import java.security.Principal;
import java.util.UUID;

public interface CompanyBusiness {

  Company getCompanyById(UUID id) throws IllegalArgumentException;

  Company getPrincipal(Principal principal);

}
