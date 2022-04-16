package com.indivara.hospital.models.repos;

import com.indivara.hospital.models.entities.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment,Long>{
}
