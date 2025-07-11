package com.example.userManagementAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userManagementAPI.Model.User;


import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    //List<User> findByNameContainingIgnoreCase(String name);
}