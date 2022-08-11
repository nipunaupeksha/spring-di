package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DE", "default"})
@Service("i18nService")
public class I18nGermanService implements HelloWorldService{

    @Override
    public String sayHelloWorld() {

        return "Hallo Welt - de";
    }
}
