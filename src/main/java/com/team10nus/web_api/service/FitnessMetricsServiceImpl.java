package com.team10nus.web_api.service;

import com.team10nus.web_api.dto.FitnessMetricsRequest;
import com.team10nus.web_api.entity.FitnessMetrics;
import com.team10nus.web_api.repository.FitnessMetricsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FitnessMetricsServiceImpl implements FitnessMetricsService {
    @Autowired
    private FitnessMetricsRepository fitnessMetricsRepository;

    @Override
    public FitnessMetrics getFitnessMetrics(Integer id) {
        return fitnessMetricsRepository.findByFitnessMetricsId(id);
    }

    @Override
    public FitnessMetrics updateFitnessMetrics(FitnessMetricsRequest fitnessMetricsRequest) {
        FitnessMetrics fitnessMetrics = fitnessMetricsRepository.findByFitnessMetricsId(fitnessMetricsRequest.getFitnessMetricsId());
        fitnessMetrics.setSleepHours(fitnessMetricsRequest.getSleepHours());
        fitnessMetrics.setWaterConsumption(fitnessMetricsRequest.getWaterConsumption());
        fitnessMetrics.setWeight(fitnessMetricsRequest.getWeight());
        fitnessMetrics.setHeight(fitnessMetricsRequest.getHeight());

        return fitnessMetricsRepository.save(fitnessMetrics);
    }
}
