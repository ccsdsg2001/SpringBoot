package com.example.springbootweb.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年10月15日 10:35
 */
@WebFilter(urlPatterns = {"/css"})
public class Fileter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
