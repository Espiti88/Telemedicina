package com.unisabana.edu.co.telemedicina.usuarios;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<?> login(@RequestBody User user) {
        boolean isAuthenticated = authService.authenticate(user.getCedula(), user.getPassword());

        if (isAuthenticated) {
            // Devuelve un objeto JSON con el token y la cédula
            return ResponseEntity.ok(Map.of(
                "token", "fake-jwt-token", 
                "cedula", user.getCedula()
            ));
        } else {
            return ResponseEntity.status(401).body("Credenciales incorrectas.");
        }
    }
}
