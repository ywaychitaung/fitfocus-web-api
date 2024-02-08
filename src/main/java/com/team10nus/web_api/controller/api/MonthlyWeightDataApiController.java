package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.MonthlyWeightData;
import com.team10nus.web_api.service.MonthlyWeightDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/monthly-weight-data")
public class MonthlyWeightDataApiController {
    @Autowired
    private MonthlyWeightDataService monthlyWeightDataService;

    @GetMapping("/show/{id}")
    public ResponseEntity<MonthlyWeightData> show(@PathVariable("id") Integer id) {
        MonthlyWeightData monthlyWeightData = monthlyWeightDataService.getMonthlyWeightData(id);

        if (monthlyWeightData != null) {
            return new ResponseEntity<>(monthlyWeightData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
