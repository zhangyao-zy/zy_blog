package com.zy.blog.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.zy.blog.entity.Article;
/**
*  @author zhangyao
*/
public interface ArticleBaseMapper {

    int insertArticle(Article object);

    int updateArticle(Article object);

    int update(Article.UpdateBuilder object);

    List<Article> queryArticle(Article object);

    Article queryArticleLimit1(Article object);

}