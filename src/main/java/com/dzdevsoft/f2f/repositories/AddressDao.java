package com.dzdevsoft.f2f.repositories;

import com.dzdevsoft.f2f.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address, Long> {

}
