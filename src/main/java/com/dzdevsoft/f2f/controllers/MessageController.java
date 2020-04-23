package com.dzdevsoft.f2f.controllers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers.MessageMapper;
import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.MessageDto;
import com.dzdevsoft.f2f.entities.Message;
import com.dzdevsoft.f2f.services.contracts.CompanyBusiness;
import com.dzdevsoft.f2f.services.contracts.InfluencerBusiness;
import com.dzdevsoft.f2f.services.contracts.MessageBusiness;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {

  private final MessageBusiness messageBusiness;
  private final MessageMapper messageMapper;
  private final InfluencerBusiness influencerBusiness;
  private final CompanyBusiness companyBusiness;

  public MessageController(MessageBusiness messageBusiness,
      MessageMapper messageMapper,
      InfluencerBusiness influencerBusiness,
      CompanyBusiness companyBusiness) {
    this.messageBusiness = messageBusiness;
    this.messageMapper = messageMapper;
    this.influencerBusiness = influencerBusiness;
    this.companyBusiness = companyBusiness;
  }

  @GetMapping("/api/v1/messages/influencer")
  public List<MessageDto> getAllInfluencerMessages(Principal principal) {
    List<Message> other = new ArrayList<>();
    return (messageBusiness
        .getMessagesfromInfulencerDao(influencerBusiness.getPrincipal(principal)).orElse(other))
        .stream().map(messageMapper::toMessageDto).collect(
            Collectors.toList());
  }

  @GetMapping("/api/v1/messages/company")
  public List<MessageDto> getAllCompanyMessages(Principal principal) {
    List<Message> other = new ArrayList<>();
    return (messageBusiness
        .getMessagesfromCompanyDao(companyBusiness.getPrincipal(principal)).orElse(other)).stream()
        .map(messageMapper::toMessageDto).collect(Collectors.toList());
  }

  @PostMapping("/api/v1/message/influencer")
  public MessageDto createMessageFromInfluencer(@RequestBody MessageDto messageDto,
      Principal principal) {

    Message message = messageMapper.toMessage(messageDto);

    message.setCompany(companyBusiness
        .getCompanyById(UUID.fromString(messageDto.getReceiver())));
    message
        .setInfluencer(influencerBusiness.getInfluencerById(UUID.fromString(principal.getName())));

    messageBusiness.createMessage(message);
    return messageMapper.toMessageDto(message);
  }

  @PostMapping("/api/v1/message/company")
  public MessageDto createMessageForCompany(@RequestBody MessageDto messageDto,
      Principal principal) {
    Message message = messageMapper.toMessage(messageDto);

    message.setInfluencer(influencerBusiness
        .getInfluencerById(UUID.fromString(messageDto.getReceiver())));
    message
        .setCompany(companyBusiness.getCompanyById(UUID.fromString(principal.getName())));

    messageBusiness.createMessage(message);
    return messageMapper.toMessageDto(message);
  }
}

