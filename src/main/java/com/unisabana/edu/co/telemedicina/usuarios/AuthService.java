package com.unisabana.edu.co.telemedicina.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String cedula, String password) {
        Optional<User> user = userRepository.findByCedula(cedula);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}
