package com.example.springbootweb.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年10月14日 20:05
 */
@Order(value = Ordered.HIGHEST_PRECEDENCE) //异常优先级
@Component
public class CustomException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            response.sendError(511,"错误");
        } catch (IOException e) {
            e.printStackTrace();
        }
            return new ModelAndView();
    }
}
