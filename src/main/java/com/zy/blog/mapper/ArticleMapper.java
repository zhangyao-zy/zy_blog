package com.zy.blog.mapper;

import java.util.List;

import com.zy.blog.dao.ArticleDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.zy.blog.entity.Article;
import com.zy.blog.mapper.base.ArticleBaseMapper;
import org.apache.ibatis.annotations.Select;

/**
*  @author zhangyao
*/
public interface ArticleMapper extends ArticleBaseMapper{

    List<ArticleDao> queryArticleList();

    ArticleDao queryArticleByEntitys(ArticleDao articleDao);

    int deleteArticle(String[] array);
}