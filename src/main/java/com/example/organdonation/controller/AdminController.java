package com.example.organdonation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.organdonation.repository.ContactRepository;
import com.example.organdonation.repository.DonorRepository;
import com.example.organdonation.repository.StoryRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private DonorRepository donorRepository;

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private StoryRepository storyRepository;

    @GetMapping("/dashboard")
    public String adminDashboard(Model model) {
        model.addAttribute("donors", donorRepository.findAll());
        model.addAttribute("contacts", contactRepository.findAll());
        model.addAttribute("stories", storyRepository.findAll());
        return "admin-dashboard";
    }
}

