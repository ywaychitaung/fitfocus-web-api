package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.WeeklyCaloriesData;
import com.team10nus.web_api.repository.WeeklyCaloriesDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeeklyCaloriesDataServiceImpl implements WeeklyCaloriesDataService{
    @Autowired
    private WeeklyCaloriesDataRepository weeklyCaloriesDataRepository;

    @Override
    public WeeklyCaloriesData getWeeklyCaloriesData(Integer userId) {
        return weeklyCaloriesDataRepository.findByUserUserId(userId);
    }
}
