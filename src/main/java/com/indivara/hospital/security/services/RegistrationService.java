package com.indivara.hospital.security.services;

import com.indivara.hospital.models.entities.Registration;
import com.indivara.hospital.models.repos.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration create(Registration registration){
        return registrationRepository.save(registration);
    }

    public List<Registration> findAllRegistration(){
        return  registrationRepository.findAll();
    }
}
