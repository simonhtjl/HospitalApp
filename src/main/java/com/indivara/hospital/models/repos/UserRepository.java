package com.indivara.hospital.models.repos;

import com.indivara.hospital.models.entities.ERole;
import com.indivara.hospital.models.entities.Role;
import com.indivara.hospital.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String Email);

}
