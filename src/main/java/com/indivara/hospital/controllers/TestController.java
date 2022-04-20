package com.indivara.hospital.controllers;
import com.indivara.hospital.models.entities.*;
import com.indivara.hospital.models.repos.RegistrationRepository;
import com.indivara.hospital.security.services.RegistrationService;
import com.indivara.hospital.security.services.TreatmentService;
import com.indivara.hospital.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private UserService userService;

    @Autowired
    private TreatmentService treatmentService;

    @Autowired
    private RegistrationRepository registrationRepository;


    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    //PASIEN
    @GetMapping("/pasien/daftardokter")
    @PreAuthorize("hasRole('PASIEN')")
    public List<User> getUser(){
        return userService.getAllDokter();
    }

    @PostMapping("/pasien/registrasi")
    @PreAuthorize("hasRole('PASIEN')")
    public Registration create(@RequestBody Registration registration){
        return registrationService.create(registration);
    }


    //DOKTER
    @GetMapping("/dokter")
    @PreAuthorize("hasRole('DOKTER')")
    public String adminAccess() {
        return "Dokter Board.";
    }

    @GetMapping("/dokter/daftarpasien")
    @PreAuthorize("hasRole('DOKTER')")
    public List<Registration> findAllRegistration(){
        return registrationService.findAllRegistration();
    }

    @PostMapping("/dokter/treatment")
    @PreAuthorize("hasRole('DOKTER')")
    public Treatment create(@RequestBody Treatment treatment){
        return treatmentService.create(treatment);
    }

    @GetMapping("/dokter/daftartreatment")
    @PreAuthorize("hasRole('DOKTER')")
    public List<Treatment> findAllTreatment(){
        return treatmentService.findAllTreatment();
    }

//    @GetMapping("/dokter/registration/{id}")
//    @PreAuthorize("hasRole('DOKTER')")
    @GetMapping("/dokter/treatment/{id}")
    @PreAuthorize("hasRole('DOKTER')")
    public ResponseEntity<Registration> getRegistrationById(@PathVariable("id") Long id) {
        Optional<Registration> registrationData = registrationRepository.findById(id);
        if (registrationData.isPresent()) {
            return new ResponseEntity<>(registrationData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //ADMIN
    @GetMapping("/superadmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String moderatorAccess() {
        return "Admin Board.";
    }
}
