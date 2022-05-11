package com.example.bankwebsite.models;


import javax.persistence.*;

@Entity
@Table(name = "SavingsAccounts")
public class SavingsAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    (nullable = false, length = 50, unique = true)
    private Long SavingsAccount;
}
