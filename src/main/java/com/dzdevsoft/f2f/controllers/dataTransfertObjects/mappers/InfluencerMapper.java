package com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.InfluencerDto;
import com.dzdevsoft.f2f.entities.Influencer;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface InfluencerMapper {

  //@Mapping(target = "id", source = "id",)
  @Mapping(target = "address.id", source = "address")
  @Mapping(target = "links.id", source = "links")
  Influencer toInfluencer(InfluencerDto influencerDto);

  //@Mapping(target = "id", source = "id")
  @Mapping(target = "address", source = "address.id")
  @Mapping(target = "links", source = "links.id")
  InfluencerDto toInfluencerDto(Influencer influencer);
}
