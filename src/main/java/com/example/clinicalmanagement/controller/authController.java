package com.example.clinicalmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.clinicalmanagement.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

public class authController {  @GetMapping("/")
    public String home() {
        return "home"; // Home page
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Login page
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "signup"; // Signup page
    }

    @PostMapping("/signup")
    public String registerUser (User user) {
        // Here you would typically save the user to the database
        return "redirect:/login"; // Red
    }
}
