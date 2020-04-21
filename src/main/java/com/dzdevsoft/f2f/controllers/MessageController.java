package com.dzdevsoft.f2f.controllers;

import com.dzdevsoft.f2f.entities.Message;
import com.dzdevsoft.f2f.services.contracts.MessageBusiness;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  private final MessageBusiness messageBusiness;

  public MessageController(MessageBusiness messageBusiness) {
    this.messageBusiness = messageBusiness;
  }

  @GetMapping("/api/v1/messages/influencer/{email}")
  public List<Message> getAllInfluencerMessages(@PathVariable("email") String email) {
    List<Message> other = new ArrayList<>();
    return messageBusiness
        .getMessagesfromInfulencerEmailDao(email).orElse(other);
  }

  @GetMapping("/api/v1/messages/company/{email}")
  public List<Message> getAllCompanyMessages(@PathVariable("email") String email) {
    List<Message> other = new ArrayList<>();
    return messageBusiness
        .getMessagesfromCompanyEmailDao(email).orElse(other);
  }
}

