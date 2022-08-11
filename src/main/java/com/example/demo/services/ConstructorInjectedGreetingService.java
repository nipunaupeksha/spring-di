package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements HelloWorldService{

    @Override
    public String sayHelloWorld() {

        return "Hello World - constructor";
    }
}
