package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.WeeklyWaterConsumptionData;

public interface WeeklyWaterConsumptionDataService {
    WeeklyWaterConsumptionData getWeeklyWaterConsumptionData(Integer userId);
}
