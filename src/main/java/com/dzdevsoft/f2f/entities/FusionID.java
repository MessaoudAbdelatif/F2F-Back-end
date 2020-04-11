package com.dzdevsoft.f2f.entities;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class FusionID implements Serializable {

  private UUID influencerID;
  private UUID companyID;
}
