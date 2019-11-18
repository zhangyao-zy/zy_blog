package com.zy.blog.component;

import com.zy.blog.interceptor.LoginInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author: zhangyao
 * @create:2019-11-06 11:11
 **/
@Configuration
public class WebMvcConfigAdapt implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin/index").setViewName("admin/index");
        registry.addViewController("/admin").setViewName("admin/index");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/admin/**").excludePathPatterns("**/login","/login","/admin/login");

    }
}
