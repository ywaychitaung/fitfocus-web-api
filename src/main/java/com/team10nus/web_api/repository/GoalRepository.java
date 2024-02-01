package com.team10nus.web_api.repository;

import com.team10nus.web_api.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
}

