package com.example.organdonation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.organdonation.model.Story;
import com.example.organdonation.repository.StoryRepository;

@Controller











public class StoryController {

    @Autowired
    private StoryRepository storyRepo;

    @PostMapping("/submit-story")
    public String submitStory(@ModelAttribute Story story) {
        storyRepo.save(story);
        return "redirect:/story-success.html";
    }
}
