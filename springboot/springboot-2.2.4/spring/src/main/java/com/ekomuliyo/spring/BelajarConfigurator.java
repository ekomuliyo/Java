package com.ekomuliyo.spring;

import com.ekomuliyo.spring.model.DataBean;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * BelajarConfigurator
 */
@SpringBootApplication
public class BelajarConfigurator {

    @Bean
    public DataBean createDataBean(){
        DataBean dataBean = new DataBean("Eko Muliyo");
        return dataBean;
    }
}