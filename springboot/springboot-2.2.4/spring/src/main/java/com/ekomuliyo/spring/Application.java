package com.ekomuliyo.spring;

import com.ekomuliyo.spring.model.DataBean;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BelajarConfigurator.class, args);

		DataBean dataBean = context.getBean(DataBean.class);
		System.out.println(dataBean.getValue());
	}
}
