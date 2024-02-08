package com.team10nus.web_api.dto;

public class FitnessMetricsRequest {
    // Attributes
    private int fitnessMetricsId;
    private int sleepHours;

    private int waterConsumption;

    private double weight;

    private double height;

    // Empty Constructor
    public FitnessMetricsRequest() {}

    // Constructor Overloading
    public FitnessMetricsRequest(int fitnessMetricsId, int sleepHours, int waterConsumption, double weight, double height) {
        this.fitnessMetricsId = fitnessMetricsId;
        this.sleepHours = sleepHours;
        this.waterConsumption = waterConsumption;
        this.weight = weight;
        this.height = height;
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
}
