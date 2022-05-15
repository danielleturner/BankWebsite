package com.example.bankwebsite.models;


import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    (nullable = false, length = 50, unique = true)
    private String password;

    @Column
    (nullable = false, length = 50, unique = true)
    private String email;

    @Column
    (nullable = false, length = 50, unique = true)
    private String username;

    @ManyToOne
    private User owner;

    /*Constructors**/
    public User(){}

    public User(Long id, String password, String email, String username, User owner) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.username = username;
        this.owner = owner;
    }

    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
