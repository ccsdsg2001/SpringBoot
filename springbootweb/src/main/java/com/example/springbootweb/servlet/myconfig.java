package com.example.springbootweb.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author cc
 * @date 2022年10月15日 10:41
 */

@Configuration
public class myconfig {

    public ServletRegistrationBean ad(){
        sertecle sertecle = new sertecle();

        return new ServletRegistrationBean(sertecle,"/my","my02");

    }

    @Bean
    public FilterRegistrationBean firationBean(){
        Fileter fileter = new Fileter();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(fileter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/my","/css/*"));
        return filterRegistrationBean;

    }


}
