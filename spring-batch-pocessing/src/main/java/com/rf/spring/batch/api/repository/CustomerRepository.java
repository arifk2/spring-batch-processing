package com.rf.spring.batch.api.repository;

import com.rf.spring.batch.api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
