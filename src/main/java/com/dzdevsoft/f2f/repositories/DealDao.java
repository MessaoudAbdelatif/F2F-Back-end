package com.dzdevsoft.f2f.repositories;

import com.dzdevsoft.f2f.entities.Deal;
import com.dzdevsoft.f2f.entities.FusionID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DealDao extends JpaRepository<Deal, FusionID> {

}
