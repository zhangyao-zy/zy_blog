package com.zy.blog.service;

import com.zy.blog.dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * 用户数据操作服务
 */

@Service
public interface UserService {

    HashMap<String, Object> login(UserDao user);
}
