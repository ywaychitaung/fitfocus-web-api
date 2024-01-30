package com.team10nus.web_api.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @NotEmpty(message = "Email cannot be empty.")
    @Email(message = "Invalid email format.")
    @Column(name="email")
    private String email;

    @NotEmpty(message = "First name cannot be empty.")
    @Column(name="first_name")
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty.")
    @Column(name="last_name")
    private String lastName;

    @NotEmpty(message = "Username cannot be empty.")
    @Column(name="username")
    private String username;

    @NotEmpty(message = "Password cannot be empty.")
    @Size(min = 6, message = "Password must be at least 6 characters long.")
    @Column(name="password")
    private String password;

    // Relationships
    @OneToOne(mappedBy = "user")
    @JsonIgnore
    public FitnessMetrics fitnessMetrics;

    // Empty Constructor
    public User() {}

    // Constructor Overloading
    public User(String email,
                String firstName,
                String lastName,
                String username,
                String password,
                Integer roleId) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    // Getters & Setters
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public FitnessMetrics getFitnessMetrics() {
        return fitnessMetrics;
    }

    public void setFitnessMetrics(FitnessMetrics fitnessMetrics) {
        this.fitnessMetrics = fitnessMetrics;
    }
}