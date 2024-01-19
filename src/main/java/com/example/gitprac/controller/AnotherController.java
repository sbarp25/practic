package com.example.gitprac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {
    @GetMapping(path = "/home")
    public String home(){
        return "fetch practice";
    }
}
