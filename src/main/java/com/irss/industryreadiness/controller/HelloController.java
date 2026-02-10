package com.irss.industryreadiness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Industry Readiness Scoring System is running!";
    }

    @GetMapping("/status")
    public String status() {
        return "Industry Readiness System Status: ACTIVE";
    }
}
