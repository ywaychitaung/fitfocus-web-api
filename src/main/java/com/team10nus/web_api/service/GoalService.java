package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.Goal;

public interface GoalService {
    Goal getGoals(Long goalsId);
    Goal createGoals(Goal goals);
}

