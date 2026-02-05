package dev.artha.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @Value("${app.environment:local}")
    private String environmentName;

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
                "message", "Hello World",
                "environment", environmentName
        );
    }
}
