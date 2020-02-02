package com.ekomuliyo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BelajarConfigurator.class, args);
	}

}
