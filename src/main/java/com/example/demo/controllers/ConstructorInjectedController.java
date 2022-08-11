package com.example.demo.controllers;

import com.example.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final HelloWorldService helloWorldService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") HelloWorldService helloWorldService) {

        this.helloWorldService = helloWorldService;
    }

    public String getHelloWorld() {

        return helloWorldService.sayHelloWorld();
    }
}
