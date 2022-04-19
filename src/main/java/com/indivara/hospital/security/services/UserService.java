package com.indivara.hospital.security.services;

import com.indivara.hospital.models.entities.User;
import com.indivara.hospital.models.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllDokter(){
        return  userRepository.findAll();
    }
}
