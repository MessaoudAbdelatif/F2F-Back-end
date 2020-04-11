package com.dzdevsoft.f2f;

import static org.assertj.core.api.Assertions.assertThat;

import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.repositories.InfluencerDao;
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
        "classpath:create_test_db.sql"})})
public class DaoIT {

  @Autowired
  InfluencerDao influencerDao;

  @Test
  public void getInfluncerFromDb_thenSucess() {
    Influencer influencer = influencerDao
        .getOne(UUID.fromString("5e94d9a0-3123-4523-9b71-4236b4cef93e"));
        assertThat(influencer).isNotEqualTo(null);
  }
}
