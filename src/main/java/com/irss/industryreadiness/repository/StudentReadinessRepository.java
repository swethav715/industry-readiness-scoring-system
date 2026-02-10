package com.irss.industryreadiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.irss.industryreadiness.model.StudentReadiness;

public interface StudentReadinessRepository
        extends JpaRepository<StudentReadiness, Integer> {
}
