package com.team10nus.web_api.repository;

import com.team10nus.web_api.entity.WeeklyWaterConsumptionData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeklyWaterConsumptionDataRepository extends JpaRepository<WeeklyWaterConsumptionData, Integer> {
    WeeklyWaterConsumptionData findByUserUserId(Integer userId);
}
