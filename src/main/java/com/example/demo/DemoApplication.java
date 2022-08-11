package com.example.demo;

import com.example.demo.controllers.ConstructorInjectedController;
import com.example.demo.controllers.I18nController;
import com.example.demo.controllers.PrimaryController;
import com.example.demo.controllers.PropertyInjectedController;
import com.example.demo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getHelloWorld());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getHelloWorld());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getHelloWorld());

		PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");
		System.out.println(primaryController.getHelloWorld());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getHelloWorld());
	}
}
