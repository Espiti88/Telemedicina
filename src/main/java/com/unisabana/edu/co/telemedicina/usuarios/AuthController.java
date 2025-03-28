package com.unisabana.edu.co.telemedicina.usuarios;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @Autowired
    private AuthService authService;

    // Endpoint para el inicio de sesión
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        boolean isAuthenticated = authService.authenticate(user.getCedula(), user.getPassword());

        if (isAuthenticated) {
            return ResponseEntity.ok("Inicio de sesión exitoso.");
        } else {
            return ResponseEntity.status(401).body("Credenciales incorrectas.");
        }
    }
}
