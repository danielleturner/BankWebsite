package com.example.bankwebsite.controllers;

import com.example.bankwebsite.models.User;
import com.example.bankwebsite.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final UserRepository userDao;

    public UserController(UserRepository userDao){
        this.userDao = userDao;
    }


    @GetMapping("/register")
    public String signUp(Model model){
        model.addAttribute("user", new User());

        return "users/registerPage";
    }


}
