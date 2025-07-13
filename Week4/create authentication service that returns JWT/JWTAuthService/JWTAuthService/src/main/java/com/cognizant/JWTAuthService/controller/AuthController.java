package com.cognizant.JWTAuthService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.cognizant.JWTAuthService.util.JwtUtil;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate() {
        Map<String, String> response = new HashMap<>();
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            System.out.println("Authentication object = " + authentication);

            if (authentication == null || !authentication.isAuthenticated()) {
                response.put("error", "Not authenticated");
                return response;
            }

            String username = authentication.getName();
            System.out.println("Authenticated user = " + username);

            String token = jwtUtil.generateToken(username);
            response.put("token", token);
            return response;

        } catch (Exception e) {
            e.printStackTrace();  // full error in console
            response.put("error", "Exception: " + e.getMessage());
            return response;
        }
    }
}