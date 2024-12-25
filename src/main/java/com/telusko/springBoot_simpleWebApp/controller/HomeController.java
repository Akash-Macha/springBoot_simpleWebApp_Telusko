package com.telusko.springBoot_simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        System.out.println("Macha");
        return "Welcome to Ak!";
    }

    @RequestMapping("/about")
    public String about() {
        return "We dont teach, we educate!!";
    }
}
