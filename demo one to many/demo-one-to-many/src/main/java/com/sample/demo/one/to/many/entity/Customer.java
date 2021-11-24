package com.sample.demo.one.to.many.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private int id;
    private String name;
    private String gender;
    private String email;
    @OneToMany(targetEntity =Product.class ,cascade = CascadeType.ALL)
    @JoinColumn(name = "jde",referencedColumnName = "id")
    private List<Product> products;
}
