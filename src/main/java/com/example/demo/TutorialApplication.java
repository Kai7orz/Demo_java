package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;


@RestController
public class TutorialApplication {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
