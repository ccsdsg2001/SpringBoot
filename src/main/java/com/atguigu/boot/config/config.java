package com.atguigu.boot.config;

import com.atguigu.boot.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author cc
 * @date 2022年10月04日 18:12
 * 配置类里面使用@Bean标注在方法上给容器注册组件 默认也是单实例
 * 配置类本身依然是组件
 * proxyBeanMethods:代理Bean的方法  解决组件依赖  Lite  和 full模式
 */
@Configuration(proxyBeanMethods = false) //配置类 配置文件
@Import({User.class}) //给容器中自动创建出这个类型的组件 默认组件的名字
//@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties({User.class}) //开启属性配置功能 2 吧User这个组件注册到容器中
public class config {

    @Bean//给容器中添加组件 以方法名作为组件ID 返回类型就是组件类型  返回的值就是组件在容器中的实例
//    外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的实例对象
    @ConditionalOnBean(name = "user01")
    public User user(){
        return new User(1,"ad","ASd");
    }
    public User user01(){
        return new User(1,"ad","ASd");
    }


}
