package com.irss.industryreadiness.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.irss.industryreadiness.model.StudentInput;
import com.irss.industryreadiness.service.ScoringService;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private ScoringService scoringService;

    @PostMapping("/student/readiness")
    public Map<String, Object> calculate(@RequestBody StudentInput input) {

        int score = scoringService.calculateScore(input);
        String readinessLevel = scoringService.getReadinessLevel(score);

        Map<String, Object> response = new HashMap<>();
        response.put("score", score);
        response.put("readinessLevel", readinessLevel);

        return response;
    }
}
