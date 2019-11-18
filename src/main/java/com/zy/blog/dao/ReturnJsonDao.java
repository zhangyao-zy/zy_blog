package com.zy.blog.dao;

import java.util.List;

/**
 * @author: zhangyao
 * @create:2019-11-07 09:59
 * 前端页面需要接口返回的json数据的特有格式
 **/
public class ReturnJsonDao {
    private String code = "0";
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    private Long count;
    private List<Object> data;
}
