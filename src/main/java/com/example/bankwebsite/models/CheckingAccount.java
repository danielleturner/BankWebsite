package com.example.bankwebsite.models;


import javax.persistence.*;

@Entity
@Table(name = "CheckingAccounts")
public class CheckingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    (nullable = false, length = 50, unique = true)
    private Long CheckingAccount;
}
