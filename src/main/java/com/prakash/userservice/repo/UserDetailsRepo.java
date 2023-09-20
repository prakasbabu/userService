package com.prakash.userservice.repo;

import com.prakash.userservice.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {

    Optional<UserDetails> findByEmail(String email);
    Optional<UserDetails> findByOtp(String email);
}
