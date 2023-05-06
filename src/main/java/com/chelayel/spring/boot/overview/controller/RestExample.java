package com.chelayel.spring.boot.overview.controller;

import com.chelayel.spring.boot.overview.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/")
public class RestExample {

    private final ExampleService exampleService;

    @Autowired
    public RestExample(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping(path = "/hello")
    public String helloSpring() {
        return exampleService.getDefaultMessage();
    }

    @PostMapping(path = "/hello")
    public String postRequestParam(@RequestParam("name") String name) {
        return exampleService.computeMessage(name);
    }

    @PostMapping(path = "/hello/{name}")
    public String postPathVariable(@PathVariable("name") String name) {
        return exampleService.computeMessage(name);
    }
}
