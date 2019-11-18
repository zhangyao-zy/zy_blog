package com.zy.blog.controller;

import com.zy.blog.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author: zhangyao
 * @create:2019-11-17 20:40
 **/
@Controller
public class UploadController {

    @Autowired
    UploadService uploadService;

    @ResponseBody
    @RequestMapping("/upload")
    public Map<String,Object> upload(@RequestParam("myFile") MultipartFile multipartFile){
        return uploadService.upload(multipartFile);
    }
}
