package com.team10nus.web_api.service;

import com.team10nus.web_api.dto.FitnessMetricsRequest;
import com.team10nus.web_api.entity.FitnessMetrics;

import java.util.Optional;

public interface FitnessMetricsService {
    FitnessMetrics getFitnessMetrics(Integer id);

    FitnessMetrics updateFitnessMetrics(FitnessMetricsRequest fitnessMetricsRequest);
}
