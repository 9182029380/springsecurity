package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class EmployeeController {

    @GetMapping("/welcome")
    public String getmessage(){
        return "hi all welcome to my world";
    }
    @GetMapping("/adminwelcome")
    public String getmessage1(){
        return "hi admin welcome to my world";
    }
    @GetMapping("/userwelcome")
    public String getmessage2(){
        return "hi user welcome to my world";
    }
}
