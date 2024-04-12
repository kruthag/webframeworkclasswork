package com.example.CE4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.CE4.model.Address;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AddressController {
    @GetMapping("/address")
    public Address getMethodName() {
        Address ad=new Address(123,"Main St");
        return ad;
    }
}
