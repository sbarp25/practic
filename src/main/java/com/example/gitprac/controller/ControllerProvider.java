package com.example.gitprac.controller;

import com.example.gitprac.service.ServiceProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerProvider {
    private final ServiceProvider serviceProvider;

    public ControllerProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
    @GetMapping("get")

    public String getSomething(){
        return serviceProvider.getSomething();
    }


}
