package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.WeeklyWaterConsumptionData;
import com.team10nus.web_api.service.WeeklyWaterConsumptionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/users/weekly-water-consumption-data")
public class WeeklyWaterConsumptionDataApiController {
    @Autowired
    private WeeklyWaterConsumptionDataService weeklyWaterConsumptionDataService;

    @GetMapping("/show/{userId}")
    public ResponseEntity<WeeklyWaterConsumptionData> show(@PathVariable("userId") Integer userId) {
        WeeklyWaterConsumptionData weeklyWaterConsumptionData = weeklyWaterConsumptionDataService.getWeeklyWaterConsumptionData(userId);

        if (weeklyWaterConsumptionData != null) {
            return new ResponseEntity<>(weeklyWaterConsumptionData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
