package com.team10nus.web_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private double height; // in Meters

    @Column(name = "sleep_hours")
    private int sleepHours; // in Hours

    @Column(name = "water_consumption")
    private int waterConsumption; // in Liters

    @Column(name = "meditation_duration")
    private int meditationDuration; // in Hours

    // Relationships
    @OneToOne
    @JsonManagedReference
    private User user;

    // Empty Constructor
    public FitnessMetrics() {}

    // Constructor Overloading
    public FitnessMetrics(int fitnessMetricsId, double weight, double height, int sleepHours, int waterConsumption, int meditationDuration, User user) {
        this.fitnessMetricsId = fitnessMetricsId;
        this.weight = weight;
        this.height = height;
        this.sleepHours = sleepHours;
        this.waterConsumption = waterConsumption;
        this.meditationDuration = meditationDuration;
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

    public void setWaterConsumption (int waterTaken) {
        this.waterConsumption = waterConsumption;
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
