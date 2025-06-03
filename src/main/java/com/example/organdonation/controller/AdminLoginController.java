package com.example.organdonation.controller;

import com.example.organdonation.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminLoginController {

    // Hardcoded admin (you can replace with DB authentication)
    private final Admin admin = new Admin("admin", "admin123");

    @GetMapping("/admin/login")
    public String showLoginForm() {
        return "admin-login";
    }

    @PostMapping("/admin/login")
    public String handleLogin(@RequestParam String username,
                              @RequestParam String password,
                              Model model) {
        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
            return "redirect:/admin/dashboard";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "admin-login";
        }
    }
}
