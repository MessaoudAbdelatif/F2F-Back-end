package com.dzdevsoft.f2f.repositories;

import com.dzdevsoft.f2f.entities.Company;
import com.dzdevsoft.f2f.entities.Deal;
import com.dzdevsoft.f2f.entities.Influencer;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DealDao extends JpaRepository<Deal, Long> {


  Optional<List<Deal>> findByInfluencerOrderByCreatedDateDesc(Influencer influencer);

  Optional<List<Deal>> findByCompanyOrderByCreatedDateDesc(Company company);
}
