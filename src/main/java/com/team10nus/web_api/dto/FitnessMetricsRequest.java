package com.team10nus.web_api.dto;

public class FitnessMetricsRequest {
    // Attributes
    private int fitnessMetricsId;
    private int sleepHours;

    private int waterConsumption;

    private double weight;

    private double height;

    private double foodCaloriesConsumed;

    private double exerciseCaloriesBurned;

    private String description;

    // Empty Constructor
    public FitnessMetricsRequest() {}

    // Constructor Overloading
    public FitnessMetricsRequest(int fitnessMetricsId, int sleepHours, int waterConsumption, double weight, double height, double foodCaloriesConsumed, double exerciseCaloriesBurned, String description) {
        this.fitnessMetricsId = fitnessMetricsId;
        this.sleepHours = sleepHours;
        this.waterConsumption = waterConsumption;
        this.weight = weight;
        this.height = height;
        this.foodCaloriesConsumed = foodCaloriesConsumed;
        this.exerciseCaloriesBurned = exerciseCaloriesBurned;
        this.description = description;
    }

    // Getters & Setters
    public int getFitnessMetricsId() {
        return fitnessMetricsId;
    }

    public void setFitnessMetricsId(int fitnessMetricsId) {
        this.fitnessMetricsId = fitnessMetricsId;
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFoodCaloriesConsumed() {
        return foodCaloriesConsumed;
    }

    public void setFoodCaloriesConsumed(double foodCaloriesConsumed) {
        this.foodCaloriesConsumed = foodCaloriesConsumed;
    }

    public double getExerciseCaloriesBurned() {
        return exerciseCaloriesBurned;
    }

    public void setExerciseCaloriesBurned(double exerciseCaloriesBurned) {
        this.exerciseCaloriesBurned = exerciseCaloriesBurned;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
