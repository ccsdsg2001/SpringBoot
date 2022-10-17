package com.example.springbootweb.service.impl;

import com.example.springbootweb.Mapper.accMapper;
import com.example.springbootweb.bean.Account;
import com.example.springbootweb.service.accountser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

/**
 * @author cc
 * @date 2022年10月16日 18:54
 */

@Service
public class accountservice  implements accountser {

    @Autowired
    accMapper mapper;




    public Account GETBYID(Integer id){
       return mapper.getuser(id);
    }
}
