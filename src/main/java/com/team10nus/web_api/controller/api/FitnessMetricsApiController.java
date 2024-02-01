package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.FitnessMetrics;
import com.team10nus.web_api.service.FitnessMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class FitnessMetricsApiController {
    @Autowired
    private FitnessMetricsService fitnessMetricsService;

    @GetMapping("/fitness-metrics/{id}")
    public ResponseEntity<FitnessMetrics> show(@PathVariable("id") Integer id) {
        FitnessMetrics fitnessMetrics = fitnessMetricsService.getFitnessMetrics(id);

        if (fitnessMetrics != null) {
            return new ResponseEntity<>(fitnessMetrics, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/fitness-metrics/store")
    public ResponseEntity<?> store(@RequestBody FitnessMetrics fitnessMetrics) 
    {

        try {
            
            FitnessMetrics nFitnessMetrics=fitnessMetricsService.store(fitnessMetrics);

            return  ResponseEntity.ok(nFitnessMetrics);
            
        } catch (Exception e)
        {
             return  ResponseEntity
             .status(HttpStatus.INTERNAL_SERVER_ERROR)
             .body("Error storing fitness metrics: " + e.getMessage());
        }
        
    }
    
}
