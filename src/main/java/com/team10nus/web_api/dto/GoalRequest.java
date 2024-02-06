package com.team10nus.web_api.dto;

public class GoalRequest {
    // Attributes
    private long id;
    private double goalWeight;

    // Empty Constructor
    public GoalRequest() {}

    // Constructor Overloading
    public GoalRequest(long id ,double goalWeight) {
        this.id = id;
        this.goalWeight = goalWeight;
    }

    // Getters & Setters
    public long getId() {
        return id;
    }

    public double getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(double goalWeight) {
        this.goalWeight = goalWeight;
    }
}
