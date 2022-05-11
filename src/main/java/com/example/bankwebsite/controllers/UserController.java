package com.example.bankwebsite.controllers;

import com.example.bankwebsite.repositories.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserRepository userDao;

    public UserController(UserRepository userDao){
        this.userDao = userDao;
    }


}
