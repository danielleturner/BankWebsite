package com.example.bankwebsite.models;


import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    (nullable = false, length = 250, unique = true)
    private String First_Mi_LastName;

    @Column
    (nullable = false, length = 50, unique = true)
    private Long CheckingAccount;

    @Column
    (nullable = false, length = 50, unique = true)
    private Long SavingsAccount;

    @Column
    (nullable = false, length = 50, unique = true)
    private String password;

}
