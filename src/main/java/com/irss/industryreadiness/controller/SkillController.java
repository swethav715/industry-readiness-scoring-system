package com.irss.industryreadiness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {

    @GetMapping("/skills")
    public String getSkills() {
        return "Technical Skills: Java, Spring Boot, SQL, HTML, CSS";
    }
}
