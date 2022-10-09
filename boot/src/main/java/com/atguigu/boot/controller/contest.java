package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/")
    public String cs(@PathVariable("nam") String name){
        return null;
    }
}
