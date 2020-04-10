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
  Long id;
  @URL
  String instagramLink;
  @URL
  String facebookLink;
  @URL
  String twitterLink;
  @URL
  String youtubeLink;
  @URL
  String pinterestLink;
}
