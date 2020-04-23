package com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.CompanyDto;
import com.dzdevsoft.f2f.entities.Company;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CompanyMapper {

  Company toCompany(CompanyDto companyDto);

  CompanyDto toCompanyDto(Company company);
}
