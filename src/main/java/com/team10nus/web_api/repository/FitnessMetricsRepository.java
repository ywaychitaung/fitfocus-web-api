package com.team10nus.web_api.repository;

import com.team10nus.web_api.entity.FitnessMetrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessMetricsRepository extends JpaRepository<FitnessMetrics, Integer> {
    FitnessMetrics findByFitnessMetricsId(Integer id);
}
