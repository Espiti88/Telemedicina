package com.unisabana.edu.co.telemedicina;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite solicitudes desde 'http://localhost:3000'
        registry.addMapping("/**") // Permite CORS para todas las rutas
                .allowedOrigins("http://localhost:3000") // Especifica el origen permitido
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite estos métodos HTTP
                .allowedHeaders("*"); // Permite cualquier encabezado
    }
}
