package com.dzdevsoft.f2f;

import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.entities.Niche;
import com.dzdevsoft.f2f.repositories.InfluencerDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class F2fApplication {

  public static void main(String[] args) {
    SpringApplication.run(F2fApplication.class, args);
  }


  @Bean
  CommandLineRunner start(InfluencerDao influencerDao) {
//    List<Influencer> all = influencerDao.findAll();
//    System.out.println(all);
//    Influencer influencer = all.get(2);
//    influencerDao
//        .deleteById(UUID.fromString("d4241e3a-b298-44b8-ab6a-de2295b5947f"));
//    System.out.println();
//    List<Influencer> allO = influencerDao.findAll();
//    System.out.println(allO);
//    log.warn(
//        "************************************************************************************************");
    return args -> {
//      List<Niche> nichesArrayList = new ArrayList<>();
//      nichesArrayList.add(Niche.LIFESTYLE);
      influencerDao.save(new Influencer("Snow", "John", null, Niche.LIFESTYLE, null));
    };
  }
}
