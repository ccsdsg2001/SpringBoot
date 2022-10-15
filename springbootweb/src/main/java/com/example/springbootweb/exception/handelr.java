package com.example.springbootweb.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author cc
 * @date 2022年10月13日 22:24
 * 处理异常
 */
@Slf4j
@ControllerAdvice
public class handelr {

    @ExceptionHandler({ArithmeticException.class,NullPointerException.class}) //处理异常
    public String handler(){




        return "login";
    }
}
