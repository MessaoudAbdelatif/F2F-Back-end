package com.dzdevsoft.f2f.controllers.dataTransfertObjects.models;

import java.sql.Timestamp;
import java.util.UUID;
import lombok.Data;

@Data
public class MessageDto {

  String id;
  UUID receiver;
  String receiverName;
  String imagePathReceiver;
  String title;
  String text;
  Timestamp createdDate;

}
