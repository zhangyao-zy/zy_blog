package com.zy.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zhangyao
 * @create:2019-11-04 19:57
 **/
@Controller
public class ContactController {
    @GetMapping({"/contact","/contact.html"})
    public String contact(){
        return "contact";
    }
}
