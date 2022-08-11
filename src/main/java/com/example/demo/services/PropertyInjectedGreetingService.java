package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements HelloWorldService{

    @Override
    public String sayHelloWorld() {

        return "Hello World - property";
    }
}
