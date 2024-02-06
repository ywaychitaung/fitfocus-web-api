package com.team10nus.web_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Goal {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="starting_weight")
    private double startingWeight;

    @Column(name="current_weight")
    private double currentWeight;

    @Column(name="goal_weight")
    private double goalWeight;

    @Column(name="weekly_goal_gain_loss")
    private Double weeklyGoalGainLoss;

    @Column(name="weekly_workout_minutes")
    private Integer weeklyWorkoutMinutes;

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
    public User user;

    // Empty Constructor
    public Goal() {}

    // Constructor Overloading
    public Goal(double startingWeight, double currentWeight, double goalWeight, double weeklyGoalGainLoss, int weeklyWorkoutMinutes) {
        this.startingWeight = startingWeight;
        this.currentWeight = currentWeight;
        this.goalWeight = goalWeight;
        this.weeklyGoalGainLoss = weeklyGoalGainLoss;
        this.weeklyWorkoutMinutes = weeklyWorkoutMinutes;
    }


    // Getters & Setters
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}