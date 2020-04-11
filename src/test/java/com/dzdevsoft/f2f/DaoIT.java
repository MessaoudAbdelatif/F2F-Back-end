package com.dzdevsoft.f2f;

import static org.assertj.core.api.Assertions.assertThat;

import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.repositories.InfluencerDao;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlGroup;

@SpringBootTest(classes = {F2fApplication.class}, webEnvironment = WebEnvironment.RANDOM_PORT)
@SqlGroup({
    @Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = {
        "classpath:fake_data.sql"})})
public class DaoIT {

  @Autowired
  InfluencerDao classUnderTest;

  @Test
  public void getInfluncerFromDao_thenSucess() {
    Optional<Influencer> influencer1 = classUnderTest
        .findById(UUID.fromString("5e94d9a0-3123-4523-9b71-4236b4cef93e"));

    assertThat(influencer1).isNotEqualTo(null);
    assertThat(influencer1.get().getFirstName()).isEqualTo("Sand");
  }
}
