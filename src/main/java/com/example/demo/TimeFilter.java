package com.example.demo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("A init");
    }

    @Override
    public void destroy() {
        System.out.println("A destroy");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("A doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
