package com.dzdevsoft.f2f;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class F2fApplication {

  public static void main(String[] args) {
    SpringApplication.run(F2fApplication.class, args);
  }

//  @Bean
//  CommandLineRunner start(InfluencerDao influencerDao) {
//    return args -> {
//      influencerDao.save(new Influencer("Snow", "John", null, Niche.LIFESTYLE, null));
//    };
//  }
}
