package com.team10nus.web_api.repository;

import com.team10nus.web_api.entity.Goals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalsRepository extends JpaRepository<Goals, Long> {
}

