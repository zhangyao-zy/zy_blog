package com.zy.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zhangyao
 * @create:2019-11-05 20:37
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/article/index")
    public String index(){
        return "admin/index";
    }

    public String index1(){
        return "admin/index";
    }
}
