package com.dzdevsoft.f2f.repositories;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.entities.Influencer;
import com.dzdevsoft.f2f.entities.Message;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MessageDao extends JpaRepository<Message, Long> {

  Optional<List<Message>> findByInfluencerOrderByCreatedDateDesc(Influencer influencer);
  Optional<List<Message>> findByCompanyOrderByCreatedDateDesc(Company company);
}
