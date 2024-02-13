package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.WeeklyCaloriesData;
import org.springframework.stereotype.Service;

public interface WeeklyCaloriesDataService {
    WeeklyCaloriesData getWeeklyCaloriesData(Integer userId);
}
