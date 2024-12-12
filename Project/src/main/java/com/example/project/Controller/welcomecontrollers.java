package com.example.project.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/welcome")
public class welcomecontrollers {

    @GetMapping
    public String welcome() {
        return "Welcome to Spring Boot Rest API";
    }
}
