package com.example.CarsJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello from Spring Boot!";
    }
}