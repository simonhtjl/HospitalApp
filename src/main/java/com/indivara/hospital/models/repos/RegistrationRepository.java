package com.indivara.hospital.models.repos;

import com.indivara.hospital.models.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
}
