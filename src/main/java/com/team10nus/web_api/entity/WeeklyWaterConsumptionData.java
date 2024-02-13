package com.team10nus.web_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "weekly_water_consumption_data")
public class WeeklyWaterConsumptionData {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weekly_water_data_id")
    private int weeklyWaterDataId;

    @Column(name = "monday")
    private double monday;

    @Column(name = "tuesday")
    private double tuesday;

    @Column(name = "wednesday")
    private double wednesday;

    @Column(name = "thursday")
    private double thursday;

    @Column(name = "friday")
    private double friday;

    @Column(name = "saturday")
    private double saturday;

    @Column(name = "sunday")
    private double sunday;

    // Relationships
    @OneToOne
    @JsonManagedReference
    private User user;

    // Empty Constructor
    public WeeklyWaterConsumptionData() {}

    // Constructor Overloading
    public WeeklyWaterConsumptionData(double monday, double tuesday, double wednesday, double thursday, double friday, double saturday, double sunday, User user) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.user = user;
    }

    // Getters and Setters

    public int getWeeklyWaterDataId() {
        return weeklyWaterDataId;
    }

    public void setWeeklyWaterDataId(int weeklyWaterDataId) {
        this.weeklyWaterDataId = weeklyWaterDataId;
    }

    public double getMonday() {
        return monday;
    }

    public void setMonday(double monday) {
        this.monday = monday;
    }

    public double getTuesday() {
        return tuesday;
    }

    public void setTuesday(double tuesday) {
        this.tuesday = tuesday;
    }

    public double getWednesday() {
        return wednesday;
    }

    public void setWednesday(double wednesday) {
        this.wednesday = wednesday;
    }

    public double getThursday() {
        return thursday;
    }

    public void setThursday(double thursday) {
        this.thursday = thursday;
    }

    public double getFriday() {
        return friday;
    }

    public void setFriday(double friday) {
        this.friday = friday;
    }

    public double getSaturday() {
        return saturday;
    }

    public void setSaturday(double saturday) {
        this.saturday = saturday;
    }

    public double getSunday() {
        return sunday;
    }

    public void setSunday(double sunday) {
        this.sunday = sunday;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
