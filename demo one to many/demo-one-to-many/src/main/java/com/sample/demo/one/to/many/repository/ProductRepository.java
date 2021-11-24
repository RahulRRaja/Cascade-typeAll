package com.sample.demo.one.to.many.repository;

import com.sample.demo.one.to.many.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
