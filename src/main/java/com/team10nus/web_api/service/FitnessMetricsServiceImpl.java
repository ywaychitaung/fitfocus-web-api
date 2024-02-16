package com.team10nus.web_api.service;

import com.team10nus.web_api.dto.FitnessMetricsRequest;
import com.team10nus.web_api.entity.ActivityLog;
import com.team10nus.web_api.entity.FitnessMetrics;
import com.team10nus.web_api.repository.FitnessMetricsRepository;
import com.team10nus.web_api.repository.ActivityLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class FitnessMetricsServiceImpl implements FitnessMetricsService {
    @Autowired
    private FitnessMetricsRepository fitnessMetricsRepository;

    @Autowired
    private ActivityLogRepository activityLogRepository;

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
        fitnessMetrics.setFoodCaloriesConsumed(fitnessMetricsRequest.getFoodCaloriesConsumed());
        fitnessMetrics.setExerciseCaloriesBurned(fitnessMetricsRequest.getExerciseCaloriesBurned());

        // Create a new ActivityLog instance
        ActivityLog activityLog = new ActivityLog();
        activityLog.setDescription(fitnessMetricsRequest.getDescription());
        activityLog.setTimestamp(LocalDateTime.now()); // Set the current time as the timestamp
        activityLog.setUser(fitnessMetrics.getUser()); // Assuming the user is set in the updatedFitnessMetrics

        // Save the new activity log entry to the database
        activityLogRepository.save(activityLog);

        return fitnessMetricsRepository.save(fitnessMetrics);
    }
}
