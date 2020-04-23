package com.dzdevsoft.f2f.controllers.dataTransfertObjects.models;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class MessageDto {

  String receiver;
  String title;
  String text;
  Timestamp createdDate;

}
