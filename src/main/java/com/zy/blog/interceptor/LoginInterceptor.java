package com.zy.blog.interceptor;

import com.zy.blog.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: zhangyao
 * @create:2019-11-06 09:38
 **/

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(request.getRequestURL().indexOf("admin")!=-1){
            User user = (User) request.getSession().getAttribute("user");
            if(user!=null){
                //已登录
                return true;
            }else{
                request.setAttribute("message","请先登录");
                request.getRequestDispatcher("/admin/login").forward(request,response);
                return false;
            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
