package com.example.springbootweb.controller;

import com.example.springbootweb.bean.Account;
import com.example.springbootweb.bean.User;
import com.example.springbootweb.bean.book;
import com.example.springbootweb.service.accountservice;
import com.example.springbootweb.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author cc
 * @date 2022年10月12日 19:21
 */
@Controller
public class indexcontroller {




    @Autowired
    accountservice accountservice;

    @Autowired
    com.example.springbootweb.service.bookservice bookservice;

    @GetMapping("/book")
    @ResponseBody
    public book boook(@RequestParam("id") long id){
        return (book) bookservice.getBook(id);


    }




    @GetMapping("/acct")
    @ResponseBody
    public Account getnyid(@RequestParam("id") Integer id){

        return accountservice.GETBYID(id);

    }

    @GetMapping("/")
    public String loginpage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session,Model model){
        if(StringUtils.hasLength(user.getUserName()) && StringUtils.hasLength(user.getPassword())){
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg", "错误");
            return "login";
        }

        //登录成功重定向


    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){

        //是否登录 使用拦截器 或者 过滤器
//
//        Object user = session.getAttribute("loginUser");
//        if (user!=null) {
//            return "main";
//        }else {
//            model.addAttribute("msg", "错误");
//            return "login";
//        }
        return "main";



    }


}
