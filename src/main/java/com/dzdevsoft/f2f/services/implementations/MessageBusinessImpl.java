package com.dzdevsoft.f2f.services.implementations;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.entities.Message;
import com.dzdevsoft.f2f.repositories.MessageDao;
import com.dzdevsoft.f2f.services.contracts.CompanyBusiness;
import com.dzdevsoft.f2f.services.contracts.InfluencerBusiness;
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
  private final InfluencerBusiness influencerBusiness;
  private final CompanyBusiness companyBusiness;

  public MessageBusinessImpl(MessageDao messageDao,
      InfluencerBusiness influencerBusiness,
      CompanyBusiness companyBusiness) {
    this.messageDao = messageDao;
    this.influencerBusiness = influencerBusiness;
    this.companyBusiness = companyBusiness;
  }

  public Optional<List<Message>> getMessagesfromInfulencerEmailDao(String email) {
    Influencer influencerByEmail = influencerBusiness.getInfluencerByEmail(email);
    return messageDao.findByIdInfluencerIDOrderByCreatedDateDesc(influencerByEmail.getId());
  }

  public Optional<List<Message>> getMessagesfromCompanyEmailDao(String email) {
    Company companyByEmail = companyBusiness.getInfluencerByEmail(email);
    return messageDao.findByIdCompanyIDOrderByCreatedDateDesc(companyByEmail.getId());
  }


}
