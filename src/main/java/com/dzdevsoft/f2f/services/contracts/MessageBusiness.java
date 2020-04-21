package com.dzdevsoft.f2f.services.contracts;

import com.dzdevsoft.f2f.entities.Message;
import java.util.List;
import java.util.Optional;

public interface MessageBusiness {

  Optional<List<Message>> getMessagesfromInfulencerEmailDao(String email);

  Optional<List<Message>> getMessagesfromCompanyEmailDao(String email);
}