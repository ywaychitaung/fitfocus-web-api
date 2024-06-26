package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.dto.GoalRequest;
import com.team10nus.web_api.entity.Goal;
import com.team10nus.web_api.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/users/goals")
public class GoalApiController {
    private final GoalService goalService;

    @Autowired
    public GoalApiController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping("/show/{goalsId}")
    public ResponseEntity<Goal> showGoals(@PathVariable Long goalsId) {
        Goal goal = goalService.getGoals(goalsId);
        return ResponseEntity.ok(goal);
    }

    @PostMapping("/store")
    public ResponseEntity<Goal> storeGoals(@RequestBody Goal goal) {
        Goal newGoal = goalService.createGoals(goal);
        return new ResponseEntity<>(newGoal, HttpStatus.CREATED);
    }

    @PutMapping("/update/{goalsId}")
    public ResponseEntity<Goal> updateGoals(@RequestBody GoalRequest goalRequest) {
        Goal goal = goalService.updateGoals(goalRequest);
        return ResponseEntity.ok(goal);
    }
}

