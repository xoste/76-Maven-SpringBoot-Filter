package com.xoste.leon;

import com.xoste.leon.filter.SecondFilter;
import com.xoste.leon.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author Leon
 */
@SpringBootApplication
public class Application2 {
    public static void main(String[] args) {
        SpringApplication.run(Application2.class, args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean<SecondServlet> bean = new ServletRegistrationBean<>(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean<SecondFilter> bean = new FilterRegistrationBean<>(new SecondFilter());
//        bean.addUrlPatterns(new String[] {"*.do", "*.jsp"});
        bean.addUrlPatterns("/second");
        return bean;
    }
}
