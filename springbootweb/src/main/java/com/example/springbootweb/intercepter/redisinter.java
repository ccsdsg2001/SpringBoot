package com.example.springbootweb.intercepter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cc
 * @date 2022年10月17日 22:25
 */

@Component
public class redisinter implements HandlerInterceptor {


    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();

        //每次访问都会默认加1
        redisTemplate.opsForValue().increment(requestURI);

        return true;
    }
}
