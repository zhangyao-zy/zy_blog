package com.zy.blog.controller;

import com.zy.blog.dao.ArticleDao;
import com.zy.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

/**
 * @author: zhangyao
 * @create:2019-11-01 17:36
 **/
@Controller
public class IndexController {

    @Autowired
    public ArticleService articleService;

    @RequestMapping({"/", "index.html","index"})
    public String index(Model model) {
        List<ArticleDao> articleDaos = articleService.queryArtilceList(1,10);
        model.addAttribute("articles",articleDaos);
        return "index";
    }
}
