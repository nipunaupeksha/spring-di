package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String sayHelloWorld() {

        return "Hello World";
    }
}
