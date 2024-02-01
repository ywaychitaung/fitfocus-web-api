package com.team10nus.web_api.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team10nus.web_api.entity.Profile;
import com.team10nus.web_api.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile getProfile(Integer id) 
    {
       return profileRepository.findbyid(id);   
    }


}
