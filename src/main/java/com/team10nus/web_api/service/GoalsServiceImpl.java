package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.Goals;
import com.team10nus.web_api.repository.GoalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalsServiceImpl implements GoalsService {
    private final GoalsRepository goalsRepository;

    @Autowired
    public GoalsServiceImpl(GoalsRepository goalsRepository) {
        this.goalsRepository = goalsRepository;
    }

    @Override
    public Goals getGoals(Long goalsId) {
        return goalsRepository.findById(goalsId)
                .orElseThrow(() -> new RuntimeException("Goals not found"));
    }

    @Override
    public Goals createGoals(Goals goals) {
        return goalsRepository.save(goals);
    }
}

