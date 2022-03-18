package com.practise.controller;

import com.practise.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {
    @Autowired
    private HealthCheckService healthCheckService;

    @GetMapping("/status/{value}")
    public <T> T healthCheck(@PathVariable String value) {
        if (value.equalsIgnoreCase("SHORT")) {
            return (T) healthCheckService.getShortStatus();
        } else if (value.equalsIgnoreCase("FULL")) {
            return (T) healthCheckService.getFullStatus();
        }
        return (T) "INVALID STATUS FORMAT";
    }
}
