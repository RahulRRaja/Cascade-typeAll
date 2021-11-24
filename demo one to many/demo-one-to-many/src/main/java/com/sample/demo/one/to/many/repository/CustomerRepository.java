package com.sample.demo.one.to.many.repository;

import com.sample.demo.one.to.many.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
