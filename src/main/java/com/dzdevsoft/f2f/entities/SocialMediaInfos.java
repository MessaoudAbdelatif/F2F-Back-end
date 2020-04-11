package com.dzdevsoft.f2f.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SocialMediaInfos implements Serializable {

  @Id
  private Long id;
  @URL
  private String instagramLink;
  @URL
  private String facebookLink;
  @URL
  private String twitterLink;
  @URL
  private String youtubeLink;
  @URL
  private String pinterestLink;
}
