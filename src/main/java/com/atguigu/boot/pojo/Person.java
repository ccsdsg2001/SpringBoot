package com.atguigu.boot.pojo;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author cc
 * @date 2022年10月07日 22:10
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private User user;
    private String[] interests;
    private List<String> animal;
    private Map<String,Object> score;
    private Set<Double> salarys;
    private Map<String,List<User>> allpet;
}
