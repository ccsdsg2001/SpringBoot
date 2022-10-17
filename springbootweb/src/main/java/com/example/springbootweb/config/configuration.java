package com.example.springbootweb.config;

import com.example.springbootweb.intercepter.interce;
import com.example.springbootweb.intercepter.redisinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.MethodWrapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cc
 * @date 2022年10月13日 20:07
 */
//@EnableWebMvc //全面掌管
@Configuration
public class configuration implements WebMvcConfigurer {

    //filete是serlet定义原生组件 脱离spring可使用
    //2.interceptor是spring 定义接口,有自动装配功能
    @Autowired
    redisinter redisinter;

//定义静态资源行为
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//    }

    // 1。编写一个拦截器 实现HandlerInteceptor接口 2，拦截器注册到容器中 3 指定拦截规则(如果是拦截所有 静态资源也会呗拦截)
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new interce())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");


        registry.addInterceptor(redisinter).addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");

    }
}
