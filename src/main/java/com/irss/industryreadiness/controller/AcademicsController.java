package com.irss.industryreadiness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcademicsController {

    @GetMapping("/academics")
    public String getAcademics() {
        return "Academics: CGPA 7.91 | Department Rank: Good";
    }
}
