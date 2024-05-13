package com.draftbash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main class to start the Spring Boot application.
 */
@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    String test = "11111111111111111111111111111111111111111";

    @GetMapping("/")
    public String root() {
        return "Draftbash Users API";
    }
}
