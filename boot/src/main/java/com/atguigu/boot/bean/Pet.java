package com.atguigu.boot.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author cc
 * @date 2022年10月09日 23:09
 */
@Data
@Getter
@Setter
public class Pet {
    private String name;
    private Integer age;
}
