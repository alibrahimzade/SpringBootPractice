package com.example.relationships_practice.repository;

import com.example.relationships_practice.dao.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
