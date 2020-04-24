package com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.MessageDto;
import com.dzdevsoft.f2f.entities.Message;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MessageMapper {

  @Mapping(target = "receiver", source = "influencer.id")
  MessageDto toMessageDtoCompany(Message message);

  @Mapping(target = "receiver", source = "company.id")
  MessageDto toMessageDtoInfluencer(Message message);

  @Mapping(target = "influencer.id", source = "receiver")
  Message toMessageCompany(MessageDto messageDto);

  @Mapping(target = "company.id", source = "receiver")
  Message toMessageinfluencer(MessageDto messageDto);
}
