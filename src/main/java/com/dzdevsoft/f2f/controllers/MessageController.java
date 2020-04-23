package com.dzdevsoft.f2f.controllers;

import com.dzdevsoft.f2f.entities.Message;
import com.dzdevsoft.f2f.services.contracts.MessageBusiness;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {

  private final MessageBusiness messageBusiness;

  public MessageController(MessageBusiness messageBusiness) {
    this.messageBusiness = messageBusiness;
  }

  @GetMapping("/api/v1/messages/influencer")
  public List<Message> getAllInfluencerMessages(Principal principal) {
    List<Message> other = new ArrayList<>();
    return messageBusiness
        .getMessagesfromInfulencerEmailDao(UUID.fromString(principal.getName())).orElse(other);
  }

  @GetMapping("/api/v1/messages/company")
  public List<Message> getAllCompanyMessages(Principal principal) {
    List<Message> other = new ArrayList<>();
    return messageBusiness
        .getMessagesfromCompanyEmailDao(UUID.fromString(principal.getName())).orElse(other);
  }
}

