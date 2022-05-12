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
    private Long CheckingAccountNumber;

    @Column
    (nullable = false, length = 50)
    private Long CheckingAccountBalance;

    @Column
    (nullable = false, length = 50, unique = true)
    private Long SavingsAccountNumber;

    @Column
    (nullable = false, length = 50)
    private Long SavingsAccountBalance;

    @Column
    (nullable = false, length = 50, unique = true)
    private String password;

    @ManyToOne
    private User owner;

    /*Constructors**/
    public User(){}

    public User(Long id, String first_Mi_LastName, Long checkingAccountNumber, Long checkingAccountBalance, Long savingsAccountNumber, Long savingsAccountBalance, String password, User owner) {
        this.id = id;
        First_Mi_LastName = first_Mi_LastName;
        CheckingAccountNumber = checkingAccountNumber;
        CheckingAccountBalance = checkingAccountBalance;
        SavingsAccountNumber = savingsAccountNumber;
        SavingsAccountBalance = savingsAccountBalance;
        this.password = password;
        this.owner = owner;
    }

    /*Getters and Setters**/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_Mi_LastName() {
        return First_Mi_LastName;
    }

    public void setFirst_Mi_LastName(String first_Mi_LastName) {
        First_Mi_LastName = first_Mi_LastName;
    }

    public Long getCheckingAccountNumber() {
        return CheckingAccountNumber;
    }

    public void setCheckingAccountNumber(Long checkingAccountNumber) {
        CheckingAccountNumber = checkingAccountNumber;
    }

    public Long getCheckingAccountBalance() {
        return CheckingAccountBalance;
    }

    public void setCheckingAccountBalance(Long checkingAccountBalance) {
        CheckingAccountBalance = checkingAccountBalance;
    }

    public Long getSavingsAccountNumber() {
        return SavingsAccountNumber;
    }

    public void setSavingsAccountNumber(Long savingsAccountNumber) {
        SavingsAccountNumber = savingsAccountNumber;
    }

    public Long getSavingsAccountBalance() {
        return SavingsAccountBalance;
    }

    public void setSavingsAccountBalance(Long savingsAccountBalance) {
        SavingsAccountBalance = savingsAccountBalance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
