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

  //@ElementCollection(targetClass = Niche.class)
  @Enumerated(EnumType.STRING)
  Niche niche;

  @OneToOne(cascade = CascadeType.ALL)
  SocialMediaInfos links;

}
