package com.example.lab5_20220270.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping(value = {"", "/"})
    public String inicioUser(Model model) {
        return "user/inicio";
    }
}
