package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishService implements HelloWorldService{

    @Override
    public String sayHelloWorld() {

        return "Hello World - en";
    }
}
