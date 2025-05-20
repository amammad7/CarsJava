package com.example.CarsJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "BMW M3");
        return "greeting";
    }
}