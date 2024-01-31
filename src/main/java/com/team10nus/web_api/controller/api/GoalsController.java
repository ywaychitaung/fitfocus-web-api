package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.Goals;
import com.team10nus.web_api.service.GoalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/goals")
public class GoalsController {
    private final GoalsService goalsService;

    @Autowired
    public GoalsController(GoalsService goalsService) {
        this.goalsService = goalsService;
    }

    @GetMapping("/show/{goalsId}")
    public ResponseEntity<Goals> showGoals(@PathVariable Long goalsId) {
        Goals goals = goalsService.getGoals(goalsId);
        return ResponseEntity.ok(goals);
    }

    @PostMapping("/store")
    public ResponseEntity<Goals> storeGoals(@RequestBody Goals goals) {
        Goals newGoals = goalsService.createGoals(goals);
        return new ResponseEntity<>(newGoals, HttpStatus.CREATED);
    }
}

