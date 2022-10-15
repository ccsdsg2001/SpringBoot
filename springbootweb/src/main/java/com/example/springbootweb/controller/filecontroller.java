package com.example.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年10月13日 20:35
 * 文件上传测试
 */
@Controller
public class filecontroller {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form_layouts";
    }

    //自动封装传上来的文件
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email
    , @RequestParam("username") String username,
                         @RequestPart("headerImg")MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {

        if(!headerImg.isEmpty()){
            //保存到文件服务器
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("D:\\"+originalFilename));
        }

        if(photos.length>0){
            for(MultipartFile photo:photos){
                if(!photo.isEmpty()){
                    String originalFilename = photo.getOriginalFilename();
                    photo.transferTo(new File("D:\\"+originalFilename));
                }
            }
        }

        return "main";
    }
}
