package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.Goals;

public interface GoalsService {
    Goals getGoals(Long goalsId);
    Goals createGoals(Goals goals);
}

