package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author cc
 * @date 2022年10月11日 21:08
 */
@Controller
public class viewcontroller {

    @GetMapping("/at")
    public String a(Model model){
        model.addAttribute("da", "adad");
        model.addAttribute("link", "http://www.baidu.com");
        return "success";
    }

}
