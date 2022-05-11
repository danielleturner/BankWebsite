package com.example.bankwebsite.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomePageController {


    @GetMapping("/loginPage")
    public String loginPage(){


        return "loginPage";
    }
}
