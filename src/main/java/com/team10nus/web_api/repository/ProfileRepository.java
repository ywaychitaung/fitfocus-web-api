package com.team10nus.web_api.repository;

import com.team10nus.web_api.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}

