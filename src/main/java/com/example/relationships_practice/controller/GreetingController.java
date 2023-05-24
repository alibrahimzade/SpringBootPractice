package com.example.relationships_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/hello")
    public String hello(){
        return "home";
    }

}
