package com.example.employeejpastreamer.config;


import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final EntityManager entityManager;

    @Bean
    public JPAStreamer jpaStreamer() {
        return JPAStreamer.of(entityManager.getEntityManagerFactory());
    }
}
