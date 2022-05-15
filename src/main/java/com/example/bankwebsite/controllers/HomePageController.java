package com.example.bankwebsite.controllers;



import com.example.bankwebsite.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomePageController {


    @GetMapping("/loginPage")
    public String loginPage(){


        return "users/loginPage";
    }



}
