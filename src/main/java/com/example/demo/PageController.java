package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class PageController {
 
	@GetMapping("/")
    String home() {
        return "home";
    }
    
	@GetMapping("/start")
    String start() {
        return "start";
    }
}