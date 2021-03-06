package com.ekomuliyo.spring;

import com.ekomuliyo.spring.model.DataBean;
import com.ekomuliyo.spring.model.OtherBean;
import com.ekomuliyo.spring.model.SampleBean;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BelajarConfiguration.class, args);

		// DataBean dataBean = context.getBean(DataBean.class);
		// System.out.println(dataBean.getValue());

		// SampleBean sampleBean = context.getBean(SampleBean.class);
		// System.out.println(sampleBean.getDataBean().getValue());

		OtherBean otherBean = context.getBean(OtherBean.class);

		// muliyo
		System.out.println(otherBean.getDataBean().getValue());

		// eko
		System.out.println(otherBean.getSampleBean().getDataBean().getValue());
	}
}
