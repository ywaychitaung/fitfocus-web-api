package com.team10nus.web_api.repository;

import com.team10nus.web_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int userId);

    User findByEmail(String email);
}