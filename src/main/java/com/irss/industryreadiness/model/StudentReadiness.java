package com.irss.industryreadiness.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_readiness")
public class StudentReadiness {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int certificates;
    private int csLevels;
    private double cgpa;
    private int miniProjects;
    private int majorProjects;
    private int industryProjects;
    private boolean aptitudeCompleted;
    private boolean highAptitudeScore;
    private int score;
    private String readinessLevel;

    // ✅ REQUIRED: Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCertificates() { return certificates; }
    public void setCertificates(int certificates) { this.certificates = certificates; }

    public int getCsLevels() { return csLevels; }
    public void setCsLevels(int csLevels) { this.csLevels = csLevels; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    public int getMiniProjects() { return miniProjects; }
    public void setMiniProjects(int miniProjects) { this.miniProjects = miniProjects; }

    public int getMajorProjects() { return majorProjects; }
    public void setMajorProjects(int majorProjects) { this.majorProjects = majorProjects; }

    public int getIndustryProjects() { return industryProjects; }
    public void setIndustryProjects(int industryProjects) { this.industryProjects = industryProjects; }

    public boolean isAptitudeCompleted() { return aptitudeCompleted; }
    public void setAptitudeCompleted(boolean aptitudeCompleted) { this.aptitudeCompleted = aptitudeCompleted; }

    public boolean isHighAptitudeScore() { return highAptitudeScore; }
    public void setHighAptitudeScore(boolean highAptitudeScore) { this.highAptitudeScore = highAptitudeScore; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public String getReadinessLevel() { return readinessLevel; }
    public void setReadinessLevel(String readinessLevel) { this.readinessLevel = readinessLevel; }
}
