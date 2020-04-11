package com.dzdevsoft.f2f.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Message {

  @EmbeddedId
  private FusionID id;

  @NotNull
  private String title;

  @Lob
  private String text;
}
