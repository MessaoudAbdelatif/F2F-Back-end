package com.dzdevsoft.f2f.repositories;

import com.dzdevsoft.f2f.entities.Influencer;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfluencerDao extends JpaRepository<Influencer, UUID> {

  Influencer findByEmail(String email);
}
