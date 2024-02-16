package com.team10nus.web_api.dto;

public class GoalRequest {
    // Attributes
    private long id;
    private double goalWeight;

    private String description;

    // Empty Constructor
    public GoalRequest() {}

    // Constructor Overloading
    public GoalRequest(long id ,double goalWeight, String description) {
        this.id = id;
        this.goalWeight = goalWeight;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
