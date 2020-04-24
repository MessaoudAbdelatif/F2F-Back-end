package com.dzdevsoft.f2f.services.contracts;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.entities.Message;
import java.util.List;
import java.util.Optional;

public interface MessageBusiness {

  Optional<List<Message>> getMessagesfromInfulencerDao(Influencer influencer);

  Optional<List<Message>> getMessagesfromCompanyDao(Company company);

  Message createMessage(Message message);

  void deleteMessage(Long id);
}