package com.zy.blog.controller;

import com.zy.blog.dao.UserDao;
import com.zy.blog.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author: zhangyao
 * @create:2019-11-05 19:07
 *
 * 后台管理登陆模块
 **/

@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    public UserService userService;

    @GetMapping("/login")
    public String toLoginHtml(){
        return "admin/login";
    }

    /**
     * 登陆验证 1成功 0失败
     * @param user
     * @return
     */
    @PostMapping("/login")
    public String login(UserDao user, Model model, HttpServletRequest request){
        HashMap<String,Object> map = userService.login(user);
        if(map.get("status").equals("1")){
            request.getSession().setAttribute("user",user);
            return "redirect:index";
        }else if(map.get("status").equals("0")){
            model.addAttribute("message",map.get("message"));
            return "redirect:login";
        }else{
            model.addAttribute("message","未知错误,请联系管理员");
            return "redirect:login";
        }
    }

    @GetMapping("/loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "admin/login";
    }
}
