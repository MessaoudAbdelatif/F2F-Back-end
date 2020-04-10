package com.dzdevsoft.f2f.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Influencer extends BaseEntity implements Serializable {


  @NotNull
  @NotBlank
  String firstName;

  @NotNull
  @NotBlank
  String lastName;

  Date dateOfBirth;

  @ElementCollection(targetClass = Niches.class)
  @Enumerated(EnumType.STRING)
  List<Niches> niches;

  @OneToOne(cascade = CascadeType.ALL)
  SocialMediaInfos links;

  public enum Niches {
    TRAVELING, BEAUTY, FASHION, HEALTH_FITNESS, LIFESTYLE, PARENTING, BUSINESS, MUSIC, PHOTOGRAPHY, FOOD, ANIMALS
  }
}
