package com.example.CE3.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @GetMapping("/color")
    public String getMethodName(@RequestParam String color) {
        return "My favourite color is "+color+"!";
    }
    
}
