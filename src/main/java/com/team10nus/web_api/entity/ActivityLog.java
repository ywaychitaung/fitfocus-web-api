package com.team10nus.web_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "activity_log")
public class ActivityLog {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int activityLogId;

    private String description;

    private LocalDateTime timestamp;

    // Relationships
    @ManyToOne
    @JsonManagedReference
    private User user;

    // Empty Constructor
    public ActivityLog() {}

    // Constructor Overloading
    public ActivityLog(String description, LocalDateTime timestamp) {
        this.description = description;
        this.timestamp = timestamp;
    }

    // Getter and Setter Methods

    public int getActivityLogId() {
        return activityLogId;
    }

    public void setActivityLogId(int activityLogId) {
        this.activityLogId = activityLogId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
