package com.example.demo.controllers;

import com.example.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public HelloWorldService helloWorldService;

    public String getHelloWorld(){

        return helloWorldService.sayHelloWorld();
    }
}
