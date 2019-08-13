package com.jayden.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping(value = "/swagger")
    public String swagger() {
        return "redirect:/doc.html?lang=en";
    }

    @GetMapping(value = "/")
    public String index() {
        return "redirect:/doc.html?lang=en";
    }

}
