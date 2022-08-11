package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements HelloWorldService{

    @Override
    public String sayHelloWorld() {

        return "Hello World - setter";
    }
}
