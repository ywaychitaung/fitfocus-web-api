package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.FitnessMetrics;

import java.util.Optional;

public interface FitnessMetricsService {
    Optional<FitnessMetrics> getFitnessMetrics(Integer id);
}