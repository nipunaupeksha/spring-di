package com.example.demo.controllers;

import com.example.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final HelloWorldService helloWorldService;

    public I18nController(@Qualifier("i18nService") HelloWorldService helloWorldService) {

        this.helloWorldService = helloWorldService;
    }

    public String getHelloWorld() {

        return helloWorldService.sayHelloWorld();
    }
}
