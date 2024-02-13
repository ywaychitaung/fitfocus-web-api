package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.WeeklyWaterConsumptionData;
import com.team10nus.web_api.repository.WeeklyWaterConsumptionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeeklyWaterConsumptionDataServiceImpl implements WeeklyWaterConsumptionDataService{
    @Autowired
    private WeeklyWaterConsumptionDataRepository weeklyWaterConsumptionDataRepository;

    @Override
    public WeeklyWaterConsumptionData getWeeklyWaterConsumptionData(Integer userId) {
        return weeklyWaterConsumptionDataRepository.findByUserUserId(userId);
    }
}
