package com.team10nus.web_api.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component
@EnableScheduling
public class DatabaseResetTask {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseResetTask(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Scheduled(cron = "0 59 23 * * ?") // Scheduled to run daily at midnight
    public void transferAndResetData() {
        // Determine the day of the week to decide which column to update
        String dayOfWeek = LocalDate.now().getDayOfWeek().toString().toLowerCase();
        String columnToUpdate = dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1); // Capitalize the first letter

        // Transfer data to weekly tables for all users
        String caloriesSql = "UPDATE weekly_calories_data wcd SET " + columnToUpdate + " = (SELECT food_calories_consumed FROM fitness_metrics fm WHERE fm.user_user_id = wcd.user_user_id)";
        jdbcTemplate.update(caloriesSql);

        String waterSql = "UPDATE weekly_water_consumption_data wwcd SET " + columnToUpdate + " = (SELECT water_consumption FROM fitness_metrics fm WHERE fm.user_user_id = wwcd.user_user_id)";
        jdbcTemplate.update(waterSql);

        String sleepSql = "UPDATE weekly_sleep_data wsd SET " + columnToUpdate + " = (SELECT sleep_hours FROM fitness_metrics fm WHERE fm.user_user_id = wsd.user_user_id)";
        jdbcTemplate.update(sleepSql);

        // Reset fitness_metrics table for all users
        jdbcTemplate.update("UPDATE fitness_metrics SET water_consumption = 0, sleep_hours = 0, weight = 0, height = 0, food_calories_consumed = 0, exercise_calories_burned = 0");

        // If today is Sunday, reset all weekly data for all users
        if (LocalDate.now().getDayOfWeek() == DayOfWeek.SUNDAY) {
            resetWeeklyDataForAllUsers();
        }
    }

    private void resetWeeklyDataForAllUsers() {
        jdbcTemplate.update("UPDATE weekly_calories_data SET monday = 0, tuesday = 0, wednesday = 0, thursday = 0, friday = 0, saturday = 0, sunday = 0");
        jdbcTemplate.update("UPDATE weekly_water_consumption_data SET monday = 0, tuesday = 0, wednesday = 0, thursday = 0, friday = 0, saturday = 0, sunday = 0");
        jdbcTemplate.update("UPDATE weekly_sleep_data SET monday = 0, tuesday = 0, wednesday = 0, thursday = 0, friday = 0, saturday = 0, sunday = 0");
    }
}