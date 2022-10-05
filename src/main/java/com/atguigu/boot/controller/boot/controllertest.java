package com.atguigu.boot.controller.boot;

import com.atguigu.boot.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cc
 * @date 2022年10月02日 21:11
 */
@ResponseBody
@Controller
@Slf4j //日志文件
public class controllertest {


    @Autowired
    User user;

    @RequestMapping("/use")
    public User user(){
        return user;
    }


    @RequestMapping("/hello")
    public String hall()
    {
        log.info("qingqiu");
        return "springboot";
    }
}
