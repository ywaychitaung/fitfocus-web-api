package com.team10nus.web_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.team10nus.web_api.entity.MonthlyWeightData;

@Repository
public interface MonthlyWeightDataRepository extends JpaRepository<MonthlyWeightData, Long> {
    MonthlyWeightData findById(Integer id);
}
