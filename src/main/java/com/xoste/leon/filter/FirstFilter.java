package com.xoste.leon.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Leon
 */
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter。。。");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开filter。。。");
    }

    @Override
    public void destroy() {

    }
}
