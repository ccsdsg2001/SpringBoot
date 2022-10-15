package com.example.springbootweb.controller;

import com.example.springbootweb.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

/**
 * @author cc
 * @date 2022年10月12日 20:06
 */
@Controller
public class tabcontroller {

    @GetMapping("/basic_table")
    public String basic_table(@RequestParam("a") int a){
        int i=10/0;
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String basic_t1able(){

        //表格内容遍历
        Arrays.asList(new User("zhangsan","123"),
                new User("sad","123456"),new User("sd","123"));



        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String basic_ta2ble(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String basic_tabl323e(){
        return "table/editable_table";
    }

//
//
//


}
