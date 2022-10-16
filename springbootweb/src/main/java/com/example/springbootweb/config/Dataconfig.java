package com.example.springbootweb.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @author cc
 * @date 2022年10月16日 16:51
 */

@Configuration
public class Dataconfig {
//
//    @ConfigurationProperties("spring.datasource")
//    @Bean
//    public DataSource dataSource() throws SQLException {
//
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setFilters("stat,wall");//监控功能
//
//        return druidDataSource;
//
//    }
//
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        StatViewServlet statViewServlet = new StatViewServlet();
//        ServletRegistrationBean<StatViewServlet> statViewServletServletRegistrationBean = new ServletRegistrationBean<>(statViewServlet,"/druid/*");
//        statViewServletServletRegistrationBean.addInitParameter("loginUsername", "admin");
//        statViewServletServletRegistrationBean.addInitParameter("loginPassword", "123456");
//        return statViewServletServletRegistrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean we(){
//        WebStatFilter webStatFilter = new WebStatFilter();
//
//        FilterRegistrationBean<WebStatFilter> webStatFilterFilterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
//        webStatFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
//        webStatFilterFilterRegistrationBean.addInitParameter("exclusion", "*.js");
//
//        return webStatFilterFilterRegistrationBean;
//    }



}
