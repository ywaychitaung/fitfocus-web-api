package com.team10nus.web_api.repository;

import com.team10nus.web_api.entity.WeeklySleepData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeklySleepDataRepository extends JpaRepository<WeeklySleepData, Integer> {
    WeeklySleepData findByUserUserId(Integer userId);
}
