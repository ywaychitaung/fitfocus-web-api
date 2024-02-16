package com.team10nus.web_api.service;

import com.team10nus.web_api.dto.GoalRequest;
import com.team10nus.web_api.entity.ActivityLog;
import com.team10nus.web_api.entity.Goal;
import com.team10nus.web_api.repository.ActivityLogRepository;
import com.team10nus.web_api.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GoalServiceImpl implements GoalService {
    @Autowired
    private ActivityLogRepository activityLogRepository;

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

    @Override
    public Goal updateGoals(GoalRequest goalRequest) {
        Goal goal = goalsRepository.findById(goalRequest.getId())
                .orElseThrow(() -> new RuntimeException("Goals not found"));

        goal.setGoalWeight(goalRequest.getGoalWeight());

        // Create a new ActivityLog instance
        ActivityLog activityLog = new ActivityLog();
        activityLog.setDescription(goalRequest.getDescription());
        activityLog.setTimestamp(LocalDateTime.now()); // Set the current time as the timestamp
        activityLog.setUser(goal.getUser()); // Assuming the user is set in the updatedFitnessMetrics

        // Save the new activity log entry to the database
        activityLogRepository.save(activityLog);

        return goalsRepository.save(goal);
    }
}

