



package com.skilllab.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        // ---- Hero Section ----
        model.addAttribute("name", "Your Name");
        model.addAttribute("title", "Java Backend Developer");

        model.addAttribute("tagline",
                "I build web applications with Java and Spring Boot "
                + "and I'm looking for an opportunity to grow "
                + "as a backend developer.");

        // ---- About Section ----
        model.addAttribute("about",
                "I'm a B.Tech Computer Science student at SHEAT College, "
                + "Babatpur, Varanasi. I'm learning Java, Data Structures "
                + "and Algorithms, Spring Boot, and MySQL. "
                + "I enjoy solving problems and building backend applications.");

        model.addAttribute("location", "Varanasi, India");

        model.addAttribute("email", "sultanrose43@gmail.com");

        model.addAttribute("github", "https://github.com/sultanrose43-maker");

        model.addAttribute("linkedin",
                "https://www.linkedin.com/in/rose-sultan-324008431/ ");

        model.addAttribute("resumeUrl", "https://drive.google.com/");

        return "index";
    }
}
