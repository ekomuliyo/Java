package com.ekomuliyo.spring;

import com.ekomuliyo.spring.model.DataBean;
import com.ekomuliyo.spring.model.SampleBean;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * BelajarConfiguration
 */
@SpringBootApplication
public class BelajarConfiguration {

    @Bean
    public DataBean createDataBean(){
        DataBean dataBean = new DataBean("Eko Muliyo");
        return dataBean;
    }

    @Bean
    public SampleBean createSampleBean(DataBean dataBean){
        SampleBean sampleBean = new SampleBean(dataBean);
        return sampleBean;
    }
}