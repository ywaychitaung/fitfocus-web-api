package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.WeeklySleepData;
import com.team10nus.web_api.repository.WeeklySleepDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeeklySleepDataServiceImpl implements WeeklySleepDataService{
    @Autowired
    private WeeklySleepDataRepository weeklySleepDataRepository;

    @Override
    public WeeklySleepData getWeeklySleepData(Integer userId) {
        return weeklySleepDataRepository.findByUserUserId(userId);
    }
}
