package com.atguigu.boot.controller.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cc
 * @date 2022年10月02日 21:11
 */
@ResponseBody
@Controller
public class controllertest {

    @RequestMapping("/hello")
    public String hall(){
        return "springboot";
    }
}
