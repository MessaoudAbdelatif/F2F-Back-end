package com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.DealDto;
import com.dzdevsoft.f2f.entities.Deal;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface DealMapper {

  Deal toDeal(DealDto dealDto);

  DealDto toDealDto(Deal deal);
}
