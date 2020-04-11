package com.dzdevsoft.f2f.entities;

public enum Niche {

  TRAVELING("Traveling"),
  BEAUTY("Beauty"),
  FASHION("Fashion"),
  HEALTH_FITNESS("Health and Fitness"),
  LIFESTYLE("LifeStyle"),
  PARENTING("Parenting"),
  BUSINESS("Business"),
  MUSIC("Music"),
  PHOTOGRAPHY("Photography"),
  FOOD("Food"),
  ANIMALS("Animals");

  private final String value;

  Niche(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
