package com.dzdevsoft.f2f.controllers;

import com.dzdevsoft.f2f.entities.Message;
import com.dzdevsoft.f2f.repositories.MessageDao;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  private final MessageDao messageDao;

  public MessageController(MessageDao messageDao) {
    this.messageDao = messageDao;
  }

  @GetMapping("/api/v1/messages/{userId}")
  public List<Message> getAllMessages(@PathVariable("userId") UUID id) {
    List<Message> other = new ArrayList<>();
    return messageDao
        .findByIdInfluencerIDOrderByCreatedDateDesc(id).orElse(other);
  }
}

