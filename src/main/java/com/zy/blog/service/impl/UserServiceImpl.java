package com.zy.blog.service.impl;

import com.zy.blog.dao.UserDao;
import com.zy.blog.entity.User;
import com.zy.blog.mapper.UserMapper;
import com.zy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

/**
 * @author: zhangyao
 * @create:2019-11-05 19:24
 * 用户查询操作服务
 **/
@Repository
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;
    /**
     * 登陆验证,如果数据库存在用户返回1 不存在返回0 一并返回错误信息
     * @param user
     * @return
     */
    @Override
    public HashMap<String, Object> login(UserDao user) {
        HashMap<String,Object> map = new HashMap<>();
        User dataBaseUser = userMapper.queryUserLimit1(user);
        if(dataBaseUser!=null){
            map.put("status","1");
        }else{
            map.put("status","0");
            map.put("message","用户名或密码错误");
        }
        return map;
    }
}
