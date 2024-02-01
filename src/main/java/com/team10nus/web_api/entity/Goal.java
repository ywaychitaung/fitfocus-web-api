package com.team10nus.web_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double startingWeight;
    private double currentWeight;
    private double goalWeight;
    private double weeklyGoalGainLoss;
    private int weeklyWorkoutMinutes;

    // 构造函数
    public Goal() {
    }

    public Goal(double startingWeight, double currentWeight, double goalWeight, double weeklyGoalGainLoss, int weeklyWorkoutMinutes) {
        this.startingWeight = startingWeight;
        this.currentWeight = currentWeight;
        this.goalWeight = goalWeight;
        this.weeklyGoalGainLoss = weeklyGoalGainLoss;
        this.weeklyWorkoutMinutes = weeklyWorkoutMinutes;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getStartingWeight() {
        return startingWeight;
    }

    public void setStartingWeight(double startingWeight) {
        this.startingWeight = startingWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public double getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(double goalWeight) {
        this.goalWeight = goalWeight;
    }

    public double getWeeklyGoalGainLoss() {
        return weeklyGoalGainLoss;
    }

    public void setWeeklyGoalGainLoss(double weeklyGoalGainLoss) {
        this.weeklyGoalGainLoss = weeklyGoalGainLoss;
    }

    public int getWeeklyWorkoutMinutes() {
        return weeklyWorkoutMinutes;
    }

    public void setWeeklyWorkoutMinutes(int weeklyWorkoutMinutes) {
        this.weeklyWorkoutMinutes = weeklyWorkoutMinutes;
    }

}