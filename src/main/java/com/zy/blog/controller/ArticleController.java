package com.zy.blog.controller;

import com.zy.blog.dao.ArticleDao;
import com.zy.blog.dao.ReturnJsonDao;
import com.zy.blog.entity.Article;
import com.zy.blog.service.ArticleService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: zhangyao
 * @create:2019-11-06 16:42
 **/
@Controller
@RequestMapping("admin/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    /**
     * 跳转文章列表页面
     * @return
     */
    @GetMapping("/list")
    public String articleList(){
        return "admin/article/list";
    }

    /**
     * 跳转编辑页面
     * @return
     */
    @GetMapping("/edit")
    public String edit(ArticleDao articleDao, Model model){
        ArticleDao articleDao1 = articleService.queryArticleByEntitys(articleDao);
        model.addAttribute("article",articleDao1);
        return "admin/article/updateOrAdd";
    }
    /**
     * 跳转新增文章页面
     * @return
     */
    @GetMapping("/add")
    public String add(){
        return "admin/article/updateOrAdd";
    }

    /**
     * 提交数据
     * 保存或者更新数据到数据库
     * 0成功
     * 1失败
     * @param articleDao
     * @return
     */
    @ResponseBody
    @PostMapping("/addOrUpdate")
    public ReturnJsonDao addOrUpdate(ArticleDao articleDao){
        String code = articleService.saveArticel(articleDao);
        ReturnJsonDao returnJsonDao = new ReturnJsonDao();
        returnJsonDao.setCode(code);
        return returnJsonDao;
    }
    /**
     * 分页查询所有文章数据
     * @param articleDao
     * @return
     */
    @PostMapping("/list")
    @ResponseBody
    public ReturnJsonDao articleList(ArticleDao articleDao,Integer page, Integer limit){
        //获取文章数据
        List articleDaos = articleService.queryArtilceList(page,limit);
        ReturnJsonDao jsonDao = new ReturnJsonDao();
        jsonDao.setCount(Long.valueOf(articleDaos.size()));
        jsonDao.setData(articleDaos);
        return jsonDao;
    }

    /**
     * 删除文章
     * @param ids
     * @return
     */
    @ResponseBody
    @DeleteMapping("/del")
    public ReturnJsonDao deleteArticle(String ids){
        String code = articleService.deleteArticle(ids);
        ReturnJsonDao returnJsonDao = new ReturnJsonDao();
        returnJsonDao.setCode(code);
        return returnJsonDao;
    }

}
