package com.dzdevsoft.f2f.repositories;

import com.dzdevsoft.f2f.entities.Company;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao extends JpaRepository<Company, UUID> {

}
