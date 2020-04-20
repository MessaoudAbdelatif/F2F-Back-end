package com.dzdevsoft.f2f.repositories;

import com.dzdevsoft.f2f.entities.FusionID;
import com.dzdevsoft.f2f.entities.Message;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MessageDao extends JpaRepository<Message, FusionID> {

  Optional<List<Message>> findByIdInfluencerIDOrderByCreatedDateDesc(UUID id);

}
