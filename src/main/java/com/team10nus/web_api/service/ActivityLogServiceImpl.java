package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.ActivityLog;
import com.team10nus.web_api.repository.ActivityLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityLogServiceImpl implements ActivityLogService {
    private final ActivityLogRepository activityLogRepository;

    public ActivityLogServiceImpl(ActivityLogRepository activityLogRepository) {
        this.activityLogRepository = activityLogRepository;
    }

    @Override
    public List<ActivityLog> getActivityLog(Integer userId) {
        return activityLogRepository.findByUserUserId(userId);
    }
}
