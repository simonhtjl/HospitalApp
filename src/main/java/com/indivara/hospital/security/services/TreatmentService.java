package com.indivara.hospital.security.services;

import com.indivara.hospital.models.entities.Treatment;
import com.indivara.hospital.models.repos.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;

    public Treatment create(Treatment treatment){
        return treatmentRepository.save(treatment);
    }
    public List<Treatment> findAllTreatment(){
        return treatmentRepository.findAll();
    }

}
