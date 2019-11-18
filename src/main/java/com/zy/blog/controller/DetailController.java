package com.zy.blog.controller;

import com.zy.blog.dao.ArticleDao;
import com.zy.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zhangyao
 * @create:2019-11-04 10:24
 * 文章详情
 **/
@Controller
public class DetailController {

    @Autowired
    public ArticleService articleService;

    @GetMapping({"detail","post.html"})
    public String detail(ArticleDao articleDao, Model model){
        ArticleDao articleDao1 =  articleService.queryArticleByEntitys(articleDao);
        model.addAttribute("article",articleDao1);
        return "post";
    }
}
