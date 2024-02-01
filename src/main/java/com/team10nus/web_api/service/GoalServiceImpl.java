package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.Goal;
import com.team10nus.web_api.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalServiceImpl implements GoalService {
    private final GoalRepository goalsRepository;

    @Autowired
    public GoalServiceImpl(GoalRepository goalsRepository) {
        this.goalsRepository = goalsRepository;
    }

    @Override
    public Goal getGoals(Long goalsId) {
        return goalsRepository.findById(goalsId)
                .orElseThrow(() -> new RuntimeException("Goals not found"));
    }

    @Override
    public Goal createGoals(Goal goals) {
        return goalsRepository.save(goals);
    }
}

