package com.sample.demo.one.to.many.controller;

import com.sample.demo.one.to.many.dto.OrderRequest;
import com.sample.demo.one.to.many.entity.Customer;
import com.sample.demo.one.to.many.repository.CustomerRepository;
import com.sample.demo.one.to.many.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;
    @PostMapping("/placeorder")
    public Customer Placeorder(@RequestBody OrderRequest request)
    {
        return customerRepository.save(request.getCustomer());
    }
    @GetMapping("/findallorders")
    public List<Customer> findAllOrders()
    {
        return customerRepository.findAll();
    }
}
