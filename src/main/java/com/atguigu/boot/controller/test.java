package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author cc
 * @date 2022年10月02日 19:57
 */
@SpringBootApplication(scanBasePackages = "com.atguigu")
public class test {
//    a

    public static void main(String[] args) {
//        返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(test.class, args);

//        查看组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }

        //获取组件

        User user = run.getBean("user", User.class);

        //容器中是否有user组件
        boolean user1 = run.containsBean("user");
    }
}
