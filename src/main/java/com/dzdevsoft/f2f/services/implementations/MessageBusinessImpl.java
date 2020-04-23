package com.dzdevsoft.f2f.services.implementations;

import com.dzdevsoft.f2f.entities.Message;
import com.dzdevsoft.f2f.repositories.MessageDao;
import com.dzdevsoft.f2f.services.contracts.MessageBusiness;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class MessageBusinessImpl implements MessageBusiness {

  private final MessageDao messageDao;


  public MessageBusinessImpl(MessageDao messageDao) {
    this.messageDao = messageDao;
  }

  public Optional<List<Message>> getMessagesfromInfulencerEmailDao(UUID id) {
    return messageDao.findByIdInfluencerIDOrderByCreatedDateDesc(id);
  }

  public Optional<List<Message>> getMessagesfromCompanyEmailDao(UUID id) {
    return messageDao.findByIdCompanyIDOrderByCreatedDateDesc(id);
  }
}
