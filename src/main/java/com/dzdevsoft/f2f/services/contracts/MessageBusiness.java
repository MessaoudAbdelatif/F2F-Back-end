package com.dzdevsoft.f2f.services.contracts;

import com.dzdevsoft.f2f.entities.Message;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MessageBusiness {

  Optional<List<Message>> getMessagesfromInfulencerEmailDao(UUID id);

  Optional<List<Message>> getMessagesfromCompanyEmailDao(UUID id);
}