package com.workintech.S18D4.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "money_amount")
    private String moneyAmount;

    @JsonBackReference
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private Customer customer;
}
