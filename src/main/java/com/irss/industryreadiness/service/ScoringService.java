package com.irss.industryreadiness.service;

import org.springframework.stereotype.Service;
import com.irss.industryreadiness.model.StudentInput;
import com.irss.industryreadiness.config.ScoreConfig;

@Service
public class ScoringService {

    public int calculateScore(StudentInput input) {
        int score = 0;

        // Certificates
        score += input.getCertificates() * ScoreConfig.CERTIFICATE_POINTS;

        // CS Levels
        score += input.getCsLevels() * ScoreConfig.CS_LEVEL_POINTS;

        // CGPA
        if (input.getCgpa() >= 8.0) {
            score += ScoreConfig.CGPA_HIGH;
        } else if (input.getCgpa() >= 6.5) {
            score += ScoreConfig.CGPA_MEDIUM;
        } else {
            score += ScoreConfig.CGPA_LOW;
        }

        // Projects
        score += input.getMiniProjects() * ScoreConfig.MINI_PROJECT;
        score += input.getMajorProjects() * ScoreConfig.MAJOR_PROJECT;
        score += input.getIndustryProjects() * ScoreConfig.INDUSTRY_PROJECT;

        // Aptitude
        if (input.isAptitudeCompleted()) {
            score += ScoreConfig.APTITUDE_COMPLETED;
        }

        if (input.isHighAptitudeScore()) {
            score += ScoreConfig.HIGH_APTITUDE_SCORE;
        }
        return score;
    }

    public String getReadinessLevel(int score) {
        if (score >= 80) return "Industry Ready";
        if (score >= 50) return "Almost Ready";
        return "Needs Improvement";
    }
}
