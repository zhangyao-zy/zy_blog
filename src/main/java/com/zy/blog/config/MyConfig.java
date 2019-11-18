package com.zy.blog.config;

import com.zy.blog.component.MyLocaleResovler;
import com.zy.blog.interceptor.LoginInterceptor;
import org.springframework.boot.web.server.*;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.server.Jsp;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.File;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;


/**
 * @author: zhangyao
 * @create:2019-10-31 11:13
 **/
@Configuration
public class MyConfig{
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResovler();
    }

    @Bean
    public LoginInterceptor myLoginInterceptor(){
        return new LoginInterceptor();
    }


 /*   @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>() {

            @Override
            public void customize(ConfigurableServletWebServerFactory factory) {
                factory.setPort(9998);
            }
        };
    }*/
}
