package com.example.organdonation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.organdonation.model.Contact;
import com.example.organdonation.repository.ContactRepository;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepo;

    @PostMapping("/submit-contact")
    public String submitContact(@ModelAttribute Contact contact) {
        contactRepo.save(contact);
        return "redirect:/contact-success.html";
    }
}

