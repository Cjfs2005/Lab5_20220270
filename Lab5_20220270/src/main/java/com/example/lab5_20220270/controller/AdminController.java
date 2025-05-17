package com.example.lab5_20220270.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping(value = {"", "/"})
    public String listarEmpleados(Model model) {
        return "admin/inicio";
    }
}
