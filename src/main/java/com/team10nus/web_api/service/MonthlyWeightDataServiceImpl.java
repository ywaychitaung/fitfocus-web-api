package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.MonthlyWeightData;
import com.team10nus.web_api.repository.MonthlyWeightDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonthlyWeightDataServiceImpl implements MonthlyWeightDataService {
    @Autowired
    private MonthlyWeightDataRepository monthlyWeightDataRepository;

    @Override
    public MonthlyWeightData getMonthlyWeightData(Integer id) {
        return monthlyWeightDataRepository.findById(id);
    }
}
