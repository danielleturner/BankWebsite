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


    /**Constructor**/
    public SavingsAccount(){}

    public SavingsAccount(Long id, Long savingsAccount) {
        this.id = id;
        SavingsAccount = savingsAccount;
    }

    /*Getters and Setters**/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSavingsAccount() {
        return SavingsAccount;
    }

    public void setSavingsAccount(Long savingsAccount) {
        SavingsAccount = savingsAccount;
    }
}
