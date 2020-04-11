package com.dzdevsoft.f2f.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String street;
  private String streetAdditional;

  @NotNull
  @Pattern(regexp = "/^(?:[0-8]\\d|9[0-8])\\d{3}$/")
  private String zipCode;

  @NotNull
  private String city;

  @NotNull
  private String country;
}
