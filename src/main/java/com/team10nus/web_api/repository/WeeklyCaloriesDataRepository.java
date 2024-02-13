package com.team10nus.web_api.repository;

import com.team10nus.web_api.entity.WeeklyCaloriesData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeklyCaloriesDataRepository extends JpaRepository<WeeklyCaloriesData, Integer> {
    WeeklyCaloriesData findByUserUserId(Integer userId);
}
