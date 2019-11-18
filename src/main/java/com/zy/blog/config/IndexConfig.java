//package com.zy.blog.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.event.EventListener;
//
//import java.io.IOException;
//
///**
// * @author: zhangyao
// * @create:2019-11-12 11:31
// **/
//@Configuration
//public class IndexConfig {
//    @Value("${server.port:8080}")
//    String serverPort;
//    @EventListener({ApplicationReadyEvent.class})
//    public void applicationReadyEvent() {
//        System.out.println("应用已经准备就绪 ... 启动浏览器");
//        String url = "http://localhost:"+serverPort+"/admin";
//        Runtime runtime = Runtime.getRuntime();
//        try {
//            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}