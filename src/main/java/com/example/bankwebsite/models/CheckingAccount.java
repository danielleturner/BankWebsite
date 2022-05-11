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


    /*Constructors**/
    public CheckingAccount(){}

    public CheckingAccount(Long id, Long checkingAccount) {
        this.id = id;
        CheckingAccount = checkingAccount;
    }

    /*Getters and Setters**/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCheckingAccount() {
        return CheckingAccount;
    }

    public void setCheckingAccount(Long checkingAccount) {
        CheckingAccount = checkingAccount;
    }
}
