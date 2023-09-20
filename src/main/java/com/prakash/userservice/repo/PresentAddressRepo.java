package com.prakash.userservice.repo;

import com.prakash.userservice.entity.PresentAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentAddressRepo extends JpaRepository<PresentAddress, Long> {
}
