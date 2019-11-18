package com.zy.blog.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.zy.blog.service.UploadService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 上传图片服务
 * 上传至阿里oss
 *
 * @author: zhangyao
 * @create:2019-11-17 20:42
 **/

@Repository
public class UploadServiceImpl implements UploadService {
    @Value("https://${oss.endpoint}")
    String endpoint;
    @Value("${oss.accessKeyId}")
    String accessKeyId;
    @Value("${oss.accessKeySecret}")
    String accessKeySecret;
    @Value("${oss.bucketName}")
    String bucketName;
    @Value("https://${oss.bucketName}.${oss.endpoint}")
    String downloadUrl;

    @Override
    public HashMap<String, Object> upload(MultipartFile multipartFile) {
        HashMap<String, Object> map = new HashMap<>();
        OSS ossClient = null;
        try {
            String objectName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"))
                    + multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().indexOf("."));

            // 创建OSSClient实例。
            ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

            // 上传内容到指定的存储空间（bucketName）并保存为指定的文件名称（objectName）。
            ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(multipartFile.getBytes()));

            //访问文件的url
            String returnUrl = downloadUrl+ "/" + objectName;
            List<String> list = new ArrayList<>();
            list.add(returnUrl);
            //返回错误代码和图片路径
            map.put("data", list);
            map.put("errno", 0);
        } catch (Exception e) {
            map.put("errno",1);
            map.put("errMsg",e.toString());
        } finally {
            //关闭连接
            ossClient.shutdown();
        }
        return map;
    }


//    public String getUrl(String objectName){
//
//    }
}
