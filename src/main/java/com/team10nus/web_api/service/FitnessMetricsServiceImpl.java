package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.FitnessMetrics;
import com.team10nus.web_api.repository.FitnessMetricsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FitnessMetricsServiceImpl implements FitnessMetricsService {
    @Autowired
    private FitnessMetricsRepository fitnessMetricsRepository;

    @Override
    public FitnessMetrics getFitnessMetrics(Integer id) {
        return fitnessMetricsRepository.findByFitnessMetricsId(id);
    }

    @Override
    public FitnessMetrics store(FitnessMetrics fitnessMetrics) {
        FitnessMetrics newfitnessMetrics= new FitnessMetrics();

        newfitnessMetrics.setFitnessMetrics(fitnessMetrics.getFitnessMetrics());
        newfitnessMetrics.setHeight(fitnessMetrics.getWeight());
        newfitnessMetrics.setMeditationDuration(fitnessMetrics.getMeditationDuration());
        newfitnessMetrics.setSleepHours(fitnessMetrics.getSleepHours());
        newfitnessMetrics.setWaterConsumption(fitnessMetrics.getWaterConsumption());
        newfitnessMetrics.setWeight(fitnessMetrics.getWeight());

        return fitnessMetricsRepository.save(newfitnessMetrics);


    }
}
