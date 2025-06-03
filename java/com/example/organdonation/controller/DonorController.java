package com.example.organdonation.controller;

import com.example.organdonation.model.Donor;
import com.example.organdonation.repository.DonorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class DonorController {

    @Autowired
    private DonorRepository donorRepository;

    @PostMapping("/register")
    public String registerDonor(@ModelAttribute Donor donor) {
        // Set registration date
        donor.setRegistrationDate(LocalDateTime.now());

        // Save to DB
        donorRepository.save(donor);

        // Redirect
        return "redirect:/success.html";
    }
}
