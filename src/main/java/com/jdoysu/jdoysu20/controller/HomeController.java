package com.jdoysu.jdoysu20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // Renders Front-end
        @GetMapping("/JDoysu")
        public String home() {
            return "home"; //
        }

    @GetMapping("/")
    public String login(){
        return "login";
    }
    }


