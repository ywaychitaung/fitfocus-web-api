package com.team10nus.web_api.entity;

import jakarta.persistence.*;

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
    private double height; // in Centimeters

    @Column(name = "sleep_hours")
    private int sleepHours; // in Hours

    @Column(name = "water_taken")
    private int waterTaken; // in MilliLiters

    @Column(name = "meditation_duration")
    private int meditationDuration; // in Hours

    // Relationships
    @OneToOne
    private User user;

    // Empty Constructor
    public FitnessMetrics() {}

    // Constructor Overloading
    public FitnessMetrics(int fitnessMetricsId, double weight, double height, int sleepHours, int waterTaken, int meditationDuration, User user) {
        this.fitnessMetricsId = fitnessMetricsId;
        this.weight = weight;
        this.height = height;
        this.sleepHours = sleepHours;
        this.waterTaken = waterTaken;
        this.meditationDuration = meditationDuration;
        this.user = user;
    }

    // Getters & Setters
    public int getFitnessMetrics() {
        return fitnessMetricsId;
    }

    public void setFitnessMetrics(int fitnessMetrics) {
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

    public int getWaterTaken() {
        return waterTaken;
    }

    public void setWaterTaken(int waterTaken) {
        this.waterTaken = waterTaken;
    }

    public int getMeditationDuration() {
        return meditationDuration;
    }

    public void setMeditationDuration(int meditationDuration) {
        this.meditationDuration = meditationDuration;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
