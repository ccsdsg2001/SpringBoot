package com.atguigu.boot.bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * @author cc
 * @date 2022年10月09日 23:08
 */
@Data
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;
}
