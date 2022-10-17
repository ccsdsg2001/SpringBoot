package com.example.springbootweb.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cc
 * @date 2022年10月12日 19:33
 */

@Data
@NoArgsConstructor
//@TableName
@AllArgsConstructor
public class User {

    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;


    private Long id;
    private String name;
    private Integer age;
    private String email;
}
