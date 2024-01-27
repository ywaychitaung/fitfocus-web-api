package com.team10nus.web_api.service;

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
    public Optional<FitnessMetrics> getFitnessMetrics(Integer id) {
        return fitnessMetricsRepository.findByFitnessMetricsId(id);
    }
}
