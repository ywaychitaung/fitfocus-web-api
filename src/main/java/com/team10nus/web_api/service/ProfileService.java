package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.Profile;
import com.team10nus.web_api.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ProfileService {
    Profile getProfile(Long profileId);
    Profile createProfile(Profile profile);
    Profile updateProfile(Long profileId, Profile profile);
}
