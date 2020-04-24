package com.dzdevsoft.f2f.controllers.dataTransfertObjects.models;

import java.util.UUID;
import lombok.Data;

@Data
public class DealDto {

  String id;
  UUID receiver;
  String receiverName;
  String text;
  Boolean state;
  String title;
  String productName;
  String imageProductPath;
}
