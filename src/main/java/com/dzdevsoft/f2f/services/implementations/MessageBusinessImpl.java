package com.dzdevsoft.f2f.services.implementations;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.entities.Message;
import com.dzdevsoft.f2f.repositories.MessageDao;
import com.dzdevsoft.f2f.services.contracts.MessageBusiness;
import java.util.List;
import java.util.Optional;
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

  public Optional<List<Message>> getMessagesfromInfulencerDao(Influencer influencer) {
    return messageDao.findByInfluencerOrderByCreatedDateDesc(influencer);
  }

  public Optional<List<Message>> getMessagesfromCompanyDao(Company company) {
    return messageDao.findByCompanyOrderByCreatedDateDesc(company);
  }

  @Override
  public Message createMessage(Message message) {
    messageDao.save(message);
    return message;
  }
}
