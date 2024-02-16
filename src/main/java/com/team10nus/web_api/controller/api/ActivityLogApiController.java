package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.ActivityLog;
import com.team10nus.web_api.service.ActivityLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/activity-logs")
public class ActivityLogApiController {
    @Autowired
    private ActivityLogService activityLogService;

    @GetMapping("/show/{userId}")
    public ResponseEntity<List<ActivityLog>> showActivityLog(@PathVariable Integer userId) {
        List<ActivityLog> activityLog = activityLogService.getActivityLog(userId);
        return ResponseEntity.ok(activityLog);
    }
}
