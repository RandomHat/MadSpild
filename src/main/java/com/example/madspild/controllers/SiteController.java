package com.example.madspild.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SiteController {

    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/guidespage")
    public String guidespage(){
        return "guidespage";
    }

    @GetMapping("/guide")
    public String guide(){
        return "guide";
    }

    @GetMapping("factspage")
    public String factspage(){
        return "factspage";
    }

}
