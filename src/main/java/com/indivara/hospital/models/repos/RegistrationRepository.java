package com.indivara.hospital.models.repos;

import com.indivara.hospital.models.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
}
