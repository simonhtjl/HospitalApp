package com.indivara.hospital.models.repos;

import com.indivara.hospital.models.entities.ERole;
import com.indivara.hospital.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
