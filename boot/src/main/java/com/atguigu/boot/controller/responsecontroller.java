package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author cc
 * @date 2022年10月10日 20:19
 */
@Controller
public class responsecontroller {

    @ResponseBody
    @GetMapping("/file")
    public FileSystemResource file(){
        return null;
    }

//    1.浏览器返回xml [application/xml] jacksonXMLconverter 2.ajax请求返回json [application/json] JSON 3。app发请求 返回自定义协议数据 xxxconverter
    //步骤 1.添加自定义的messageconverter 进系统底层 2.系统底层统计所有messageConvertor 操作哪些类型 3.客户端内容we协商
    @ResponseBody
    @GetMapping("/test/person")
    public Person person(){
        Person person = new Person();
        person.setAge(25);
        person.setBirth(new Date());
        person.setUserName("ca");
        return person;
    }
}
