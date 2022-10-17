package com.example.application.data.repo;

import com.example.application.data.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}

//TODO: RepositoryTest
