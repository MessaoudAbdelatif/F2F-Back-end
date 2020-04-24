package com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.DealDto;
import com.dzdevsoft.f2f.entities.Deal;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface DealMapper {

  @Mapping(target = "receiver", source = "influencer.id")
  DealDto toDealDtoCompany(Deal deal);

  @Mapping(target = "receiver", source = "company.id")
  DealDto toDealDtoInfluencer(Deal deal);

  @Mapping(target = "influencer.id", source = "receiver")
  Deal toDealCompany(DealDto dealDto);

  @Mapping(target = "company.id", source = "receiver")
  Deal toDealinfluencer(DealDto dealDto);
}
