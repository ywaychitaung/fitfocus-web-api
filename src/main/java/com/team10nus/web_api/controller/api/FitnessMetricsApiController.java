package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.FitnessMetrics;
import com.team10nus.web_api.service.FitnessMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FitnessMetricsApiController {
    @Autowired
    private FitnessMetricsService fitnessMetricsService;

    @GetMapping("/fitness-metrics/{id}")
    public ResponseEntity<FitnessMetrics> show(@PathVariable("id") Integer id) {
        Optional<FitnessMetrics> optFitnessMetrics = fitnessMetricsService.getFitnessMetrics(id);

        if (optFitnessMetrics.isPresent()) {
            FitnessMetrics fitnessMetrics = optFitnessMetrics.get();
            return new ResponseEntity<FitnessMetrics>(fitnessMetrics, HttpStatus.OK);
        } else {
            return new ResponseEntity<FitnessMetrics>(HttpStatus.NOT_FOUND);
        }
    }
}
