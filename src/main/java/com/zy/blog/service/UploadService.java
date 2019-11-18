package com.zy.blog.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;

@Service
public interface UploadService {

    HashMap<String,Object> upload(MultipartFile multipartFile);
}
