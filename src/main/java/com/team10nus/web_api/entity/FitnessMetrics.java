package com.team10nus.web_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "fitness_metrics")
public class FitnessMetrics {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fitness_metrics_id")
    private int fitnessMetricsId;

    @Column(name = "weight")
    private double weight; // in Kilograms

    @Column(name = "height")
    private double height; // in Meters

    @Column(name = "sleep_hours")
    private int sleepHours; // in Hours

    @Column(name = "water_consumption")
    private int waterConsumption; // in Liters

    @Column(name = "meditation_duration")
    private int meditationDuration; // in Hours

    @Column(name = "bmi")
    private double bmi;

    @Column(name = "food_calories_consumed")
    private double foodCaloriesConsumed;

    @Column(name = "exercise_calories_burned")
    private double exerciseCaloriesBurned;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Lifecycle Hooks
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    // Relationships
    @OneToOne
    @JsonManagedReference
    private User user;

    // Empty Constructor
    public FitnessMetrics() {}

    // Constructor Overloading
    public FitnessMetrics(int fitnessMetricsId, double weight, double height, int sleepHours, int waterConsumption, int meditationDuration, double bmi, double foodCaloriesConsumed, double exerciseCaloriesBurned, User user) {
        this.fitnessMetricsId = fitnessMetricsId;
        this.weight = weight;
        this.height = height;
        this.sleepHours = sleepHours;
        this.waterConsumption = waterConsumption;
        this.meditationDuration = meditationDuration;
        this.bmi = bmi;
        this.foodCaloriesConsumed = foodCaloriesConsumed;
        this.exerciseCaloriesBurned = exerciseCaloriesBurned;
        this.user = user;
    }

    // Getters & Setters
    public int getFitnessMetrics() {
        return fitnessMetricsId;
    }

    public void setFitnessMetrics(int fitnessMetricsId) {
        this.fitnessMetricsId = fitnessMetricsId;
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

    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption (int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public int getMeditationDuration() {
        return meditationDuration;
    }

    public void setMeditationDuration(int meditationDuration) {
        this.meditationDuration = meditationDuration;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
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

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
