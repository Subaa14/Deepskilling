package com.cognizant.JWTAuthService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtAuthServiceApplication {
    public static void main(String[] args) {
        System.out.println("=== SPRING BOOT APP STARTED ===");

        SpringApplication.run(JwtAuthServiceApplication.class, args);
    }
}