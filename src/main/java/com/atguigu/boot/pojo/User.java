package com.atguigu.boot.pojo;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cc
 * @date 2022年10月04日 18:13
 */
@ConfigurationProperties(prefix = "use") //要放在容器中才生效
@Component
@Data //getter setter 方法
@ToString //tostring方法
@AllArgsConstructor //有参构造器
@NoArgsConstructor //无参构造器
@EqualsAndHashCode //重写 equals 和hashcode方法
public class User {

    private Integer id;
    private String username;
    private String password;




}
