package com.zy.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.zy.blog.dao.ArticleDao;
import com.zy.blog.entity.Article;
import com.zy.blog.mapper.ArticleMapper;
import com.zy.blog.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author: zhangyao
 * @create:2019-11-04 16:11
 * 文章增删改查服务
 **/
@Repository
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    public ArticleMapper articleMapper;

    Logger logger = LoggerFactory.getLogger(Logger.class);

    /**
     * 查询文章列表
     * @return
     */
    @Override
    public List<ArticleDao> queryArtilceList(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PageHelper.orderBy("create_time desc");
        return articleMapper.queryArticleList();
    }

    /**
     * 根据实体查询文章详情
     * @param articleDao
     * @return
     */
    @Override
    public ArticleDao queryArticleByEntitys(ArticleDao articleDao) {
        return articleMapper.queryArticleByEntitys(articleDao);
    }

    /**
     * 保存文章数据
     * 如果有主键就更新
     * 如果没有主键就新增一条记录
     * 返回值 1成功 0失败
     * @param articleDao
     * @return
     */
    @Override
    public String saveArticel(ArticleDao articleDao) {
        String code = "0";
        if(StringUtils.isEmpty(articleDao.getArticleId())){
            if(articleMapper.insertArticle(articleDao)==1){
                code = "1";
            }
        }else{
            if(articleMapper.updateArticle(articleDao)==1){
                code = "1";
            }
        }
        return code;
    }

    /**
     * 删除文章数据
     * @param ids
     * @return
     */
    @Override
    public String deleteArticle(String ids) {
        String code = "0";
        try {
            String [] array = ids.split(",");
            int i = articleMapper.deleteArticle(array);
            code = "1";
        }catch (Exception e){
            logger.error(e.toString());
        }
        return code;
    }
}
