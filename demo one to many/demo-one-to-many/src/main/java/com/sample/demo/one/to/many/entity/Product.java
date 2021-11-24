package com.sample.demo.one.to.many.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private int pid;
    private String p_name;
    private String qty;
}
