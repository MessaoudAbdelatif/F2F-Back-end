package com.dzdevsoft.f2f.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Deal implements Serializable {

  @EmbeddedId
  private FusionID id;

  @NotNull
  private String title;

  @Lob
  private String offer;

  private Boolean state;

  private Boolean active;

  private Double price;

  @OneToOne
  private Product product;
}
