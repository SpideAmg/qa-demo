package com.amghar.qademo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<Map<String, String>> sayHello(@PathVariable String name) {
        if (name == null || name.isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", "Name must not be empty"));
        }

        return ResponseEntity.ok(Map.of(
                "status", "QA Demo Active",
                "message", "Hello, " + name + "!"
        ));
    }

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> defaultHello() {
        return ResponseEntity.ok(Map.of(
                "status", "QA Demo Active",
                "message", "Welcome! Please provide your name in the URL, e.g. /api/hello/Spide"
        ));
    }
}
