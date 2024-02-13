package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.WeeklyCaloriesData;
import com.team10nus.web_api.service.WeeklyCaloriesDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/users/weekly-calories-data")
public class WeeklyCaloriesDataApiCotroller {
    @Autowired
    private WeeklyCaloriesDataService weeklyCaloriesDataService;

    @GetMapping("/show/{userId}")
    public ResponseEntity<WeeklyCaloriesData> show(@PathVariable("userId") Integer userId) {
        WeeklyCaloriesData weeklyCaloriesData = weeklyCaloriesDataService.getWeeklyCaloriesData(userId);

        if (weeklyCaloriesData != null) {
            return new ResponseEntity<>(weeklyCaloriesData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
