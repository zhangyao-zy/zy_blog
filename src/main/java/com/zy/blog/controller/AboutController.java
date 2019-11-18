package com.zy.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zhangyao
 * @create:2019-11-04 11:46
 **/
@Controller
public class AboutController {


    @GetMapping({"/about","/about.html"})
    public String AboutController(){
        return "about";
    }
}
