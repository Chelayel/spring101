package com.chelayel.spring.boot.overview.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String getDefaultMessage() {
        return "Hello ";
    }

    @Override
    public String computeMessage(String message) {
        return "Hello " + message;
    }
}
