package com.ontu.lab5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Lab5Controller
{
    @GetMapping("/hello-world")
    public String HelloWorld()
    {
        return "Its work!!!";
    }
}

