package com.zy.blog.service;

import com.zy.blog.dao.ArticleDao;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章查询服务
 */
@Service
public interface ArticleService {

    /**
     * 查询文章列表
     * @return
     */
    List<ArticleDao> queryArtilceList(Integer pageNum,Integer pageSize);

    /**
     * 根据实体查询文章
     * @return
     */
    ArticleDao queryArticleByEntitys(ArticleDao articleDao);


    /**
     * 保存文章数据
     * @param articleDao
     * @return
     */
    String saveArticel(ArticleDao articleDao);

    /**
     * 删除文章数据
     * @param ids
     * @return
     */
    String deleteArticle(String ids);
}
