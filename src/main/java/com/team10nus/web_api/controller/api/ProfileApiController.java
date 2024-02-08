package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.Profile;
import com.team10nus.web_api.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/users/profiles")
public class ProfileApiController {
    private final ProfileService profileService;

    @Autowired
    public ProfileApiController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/show/{profileId}")
    public ResponseEntity<Profile> showProfile(@PathVariable Long profileId) {
        Profile profile = profileService.getProfile(profileId);
        return ResponseEntity.ok(profile);
    }

    @PostMapping("/store")
    public ResponseEntity<Profile> storeProfile(@RequestBody Profile profile) {
        Profile newProfile = profileService.createProfile(profile);
        return new ResponseEntity<>(newProfile, HttpStatus.CREATED);
    }
}

