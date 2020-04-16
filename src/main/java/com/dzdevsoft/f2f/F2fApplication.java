package com.dzdevsoft.f2f;

import java.util.Arrays;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class F2fApplication {

  public static void main(String[] args) {
    SpringApplication.run(F2fApplication.class, args);
  }

//  @Bean
//  void start() {
//    String s = "salut toi sarra";
//    String collect = Arrays.stream(s.split(" "))
//        .map(s1 -> s1.length() > 4 ? new StringBuilder(s1).reverse().toString() : s1).collect(
//            Collectors.joining(" "));
//    log.error(collect);
//
//  }
}
