package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class ServerRenderedController {
    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("aboutus/")
    public String getAboutusPage() {
        return "aboutus";
    }
    
}
