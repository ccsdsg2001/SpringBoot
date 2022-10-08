package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @date 2022年10月08日 17:28
 */

@RestController
public class contest {

    @RequestMapping("/yuque_diagram.jpg")
    public String hello(){
        return "aaa";
    }

    @DeleteMapping("/delete")
    public String cs(){
        return null;
    }
}
