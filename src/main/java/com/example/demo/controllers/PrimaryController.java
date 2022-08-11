package com.example.demo.controllers;

import com.example.demo.services.HelloWorldService;

import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final HelloWorldService helloWorldService;

    public PrimaryController(HelloWorldService helloWorldService) {

        this.helloWorldService = helloWorldService;
    }

    public String getHelloWorld() {

        return helloWorldService.sayHelloWorld();
    }
}
