package com.dzdevsoft.f2f;

import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.entities.Influencer.Niches;
import com.dzdevsoft.f2f.repositories.InfluencerDao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class F2fApplication {

  public static void main(String[] args) {
    SpringApplication.run(F2fApplication.class, args);
  }


  @Bean
  CommandLineRunner start(InfluencerDao influencerDao) {
    return args -> {
      List<Niches> nichesArrayList = new ArrayList<>();
      nichesArrayList.add(Niches.LIFESTYLE);
      influencerDao.save(new Influencer("Snow", "John", null, nichesArrayList, null));
    };
  }
}
