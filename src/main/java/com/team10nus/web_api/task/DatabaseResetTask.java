package com.team10nus.web_api.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
@EnableScheduling
public class DatabaseResetTask {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseResetTask(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Scheduled(cron = "0 57 9 * * ?") // cron expression for daily execution at 9:05 AM
    public void transferAndResetData() {
        // Get current system date
        LocalDate currentDate = LocalDate.now();
        // Format the date to match your database column format (e.g., day1, day2, etc.)
        String formattedDate = "day" + currentDate.getDayOfMonth();

        // Update the weight_monthly_data table for the current day column with the weight from fitness_metrics
        jdbcTemplate.update("UPDATE weight_monthly_data SET " + formattedDate + " = (SELECT weight FROM fitness_metrics WHERE user_user_id = 1) WHERE id = ?", 1);

        // Reset the fitness_metrics table
        jdbcTemplate.update("UPDATE fitness_metrics SET water_consumption = 0, sleep_hours = 0, weight = 0, bmi = 0, exercise_calories_burned = 0, food_calories_consumed = 0 WHERE user_user_id = ?", 1);

        // Update the updated_at column to the current timestamp
        jdbcTemplate.update("UPDATE fitness_metrics SET updated_at = NOW() WHERE user_user_id = ?", 1);
    }
}
