package com.ekomuliyo.spring;

import com.ekomuliyo.spring.model.DataBean;
import com.ekomuliyo.spring.model.SampleBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * BelajarConfiguration
 */
@SpringBootApplication
public class BelajarConfiguration {

    @Bean(name = "eko")
    public DataBean createDataBean(){
        DataBean dataBean = new DataBean("Eko");
        return dataBean;
    }

    @Bean(name = "muliyo")
    public DataBean createDataBean2(){
        DataBean dataBean = new DataBean("Muliyo");
        return dataBean;
    }

    @Bean
    public SampleBean createSampleBean(@Qualifier("eko") DataBean dataBean){
        SampleBean sampleBean = new SampleBean(dataBean);
        return sampleBean;
    }
}