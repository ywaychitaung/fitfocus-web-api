package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.WeeklySleepData;
import com.team10nus.web_api.service.WeeklySleepDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/users/weekly-sleep-data")
public class WeeklySleepDataApiController {
    @Autowired
    private WeeklySleepDataService weeklySleepDataService;

    @GetMapping("/show/{userId}")
    public ResponseEntity<WeeklySleepData> show(@PathVariable("userId") Integer userId) {
        WeeklySleepData weeklySleepData = weeklySleepDataService.getWeeklySleepData(userId);

        if (weeklySleepData != null) {
            return new ResponseEntity<>(weeklySleepData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
