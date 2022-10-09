package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cc
 * @date 2022年10月09日 17:00
 */
@RestController
public class annotationcontroller {


    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id
    , @PathVariable("username") String name, @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent
    , @RequestHeader Map<String,String> header
    , @RequestParam("age") Integer age, @RequestParam("inters")List<String> inters,
                                     @RequestParam Map<String,String> params
                                     //@CookieValue("_ga") String ga
                                     ){
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("pv", pv);
        map.put("useragent", userAgent);
        map.put("header", header);
        map.put("header", inters);
        map.put("header", params);
//        map.put("header", ga);
        return map;

    }



    @PostMapping("/save")
    public Map postmethod(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }

    ///cars/sell;low=34;brand=byd,audi,yd
    //springboot 默认禁用 手动开启 UrlPathHelper进行解析  removeSemicolonContent
    @GetMapping("/cars/{path}")
    public Map matrix(@MatrixVariable("low") Integer low,
                      @MatrixVariable("brand") List<String> brand
    ,@PathVariable("path") String path){
        Map<String,Object> map = new HashMap<>();
        map.put("low", low);
        map.put("brand", brand);
        return map;

    }

    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossage,
                    @MatrixVariable(value = "age",pathVar = "empId")Integer empage){
        Map<String,Object> map = new HashMap<>();
        map.put("boss", bossage);
        map.put("boss", empage);
        return map;

    }


    @PostMapping("/saveuser")
    public Person sa(Person pseron){
        return pseron;
    }






}
