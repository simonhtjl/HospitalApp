package com.indivara.hospital.controllers;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }
    @GetMapping("/pasien")
    @PreAuthorize("hasRole('PASIEN')")
    public String userAccess() {
        return "Pasien Content.";
    }

    @GetMapping("/superadmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String moderatorAccess() {
        return "Admin Board.";
    }
    @GetMapping("/dokter")
    @PreAuthorize("hasRole('DOKTER')")
    public String adminAccess() {
        return "Dokter Board.";
    }
}
