package com.dzdevsoft.f2f.repositories;

import com.dzdevsoft.f2f.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProductDao extends JpaRepository<Product, Long> {


}
