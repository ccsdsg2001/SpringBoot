package com.example.springbootweb.service;

import com.example.springbootweb.Mapper.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cc
 * @date 2022年10月16日 21:07
 */
@Service
public class bookservice {
    @Autowired
    com.example.springbootweb.Mapper.book book;

    public book getBook(long id){
        return book.getbyid((int) id);
    }
}
