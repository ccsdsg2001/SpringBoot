package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cc
 * @date 2022年10月09日 17:17
 */
@Controller
public class RequestController {

    @GetMapping("/goto")
    public String gopage(HttpServletRequest request){
        request.setAttribute("msg", "成功");
        return "forward:/success";
    }

    @GetMapping("/success")
    @ResponseBody
    public String success(@RequestAttribute("msg") String msg){
        return msg;
    }
}
