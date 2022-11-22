package com.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @GetMapping("/")
    @ResponseBody
    public String homePage() {
        return "This is a home page!";
    }
}
