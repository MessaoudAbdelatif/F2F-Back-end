package com.dzdevsoft.f2f.services.exceptions;

public class UserNotFoundException extends IllegalArgumentException{

  public UserNotFoundException(String message) {
    super(message);
  }
}
