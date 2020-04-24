package com.dzdevsoft.f2f.controllers.dataTransfertObjects.models;

import java.util.UUID;
import lombok.Data;

@Data
public class InfluencerDto {

  UUID id;
  String description;
  String address;
  String email;
  String firstName;
  String lastName;
  String dateOfBirth;
  String niche;
  String links;
  String imagePath;

}
