package com.company.learningliquibase.repository;

import com.company.learningliquibase.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
