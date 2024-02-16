package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.ActivityLog;

import java.util.List;

public interface ActivityLogService {
    List<ActivityLog> getActivityLog(Integer userId);
}
