package com.example.clinicalmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // Maps the root URL
    public String home() {
        return "index"; // Returns the view name (index.html)
    }
}