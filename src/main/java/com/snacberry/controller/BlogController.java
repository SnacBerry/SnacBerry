package com.snacberry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "SnacBerry - Berry Snacks");
        model.addAttribute("companyStarted", "2019");
        model.addAttribute("founderName", "Sarah Johnson");
        model.addAttribute("mission", "Making berry snacks that actually taste good");
        return "index";
    }
    
    @GetMapping("/background")
    public String background(Model model) {
        model.addAttribute("title", "Our Background");
        model.addAttribute("image", "/images/kitchen.jpg");
        return "background";
    }
    
    @GetMapping("/founder")
    public String founder(Model model) {
        model.addAttribute("name", "Sarah Johnson");
        model.addAttribute("image", "/images/founder.jpg");
        model.addAttribute("quote", "Good berries make good snacks");
        return "founder";
    }
    
    @GetMapping("/past")
    public String past(Model model) {
        model.addAttribute("year", "2019-2024");
        model.addAttribute("image", "/images/old-factory.jpg");
        return "past";
    }
    
    @GetMapping("/shop")
    public String shop(Model model) {
        return "shop";
    }
}
