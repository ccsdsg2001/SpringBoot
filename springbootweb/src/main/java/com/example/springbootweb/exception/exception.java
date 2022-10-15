package com.example.springbootweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author cc
 * @date 2022年10月13日 22:31
 */

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "somany")
public class exception extends RuntimeException {

    public exception(){}


    public exception(String message){
        super(message);
    }
}


