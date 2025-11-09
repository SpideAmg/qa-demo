package com.amghar.qademo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HelloService {

    public Map<String, String> createGreeting(String name) {
        if (name == null || name.isBlank()) {
            return Map.of("error", "Name must not be empty");
        }
        return Map.of(
                "status", "QA Demo Active",
                "message", "Hello, " + name + "!"
        );
    }
}