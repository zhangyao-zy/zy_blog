package com.zy.blog.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zhangyao
*/
public class Article implements Serializable {

    private static final long serialVersionUID = 1572854197996L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer articleId;

    /**
    * 标题
    * isNullAble:1
    */
    private String articleTitle;

    /**
    * 简要描述
    * isNullAble:1
    */
    private String articleDescribe;

    /**
    * 内容
    * isNullAble:1
    */
    private String articleContent;

    /**
    * 分类
    * isNullAble:1
    */
    private String articleType;

    /**
    * 创建时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private String createTime;

    /**
    * 更新时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private String updateTime;

    /**
    * 创建人
    * isNullAble:1
    */
    private String createUser;

    /**
    * 更新人
    * isNullAble:1
    */
    private String updateUser;


    public void setArticleId(Integer articleId){this.articleId = articleId;}

    public Integer getArticleId(){return this.articleId;}

    public void setArticleTitle(String articleTitle){this.articleTitle = articleTitle;}

    public String getArticleTitle(){return this.articleTitle;}

    public void setArticleDescribe(String articleDescribe){this.articleDescribe = articleDescribe;}

    public String getArticleDescribe(){return this.articleDescribe;}

    public void setArticleContent(String articleContent){this.articleContent = articleContent;}

    public String getArticleContent(){return this.articleContent;}

    public void setArticleType(String articleType){this.articleType = articleType;}

    public String getArticleType(){return this.articleType;}

    public void setCreateTime(String createTime){this.createTime = createTime;}

    public String getCreateTime(){return this.createTime;}

    public void setUpdateTime(String updateTime){this.updateTime = updateTime;}

    public String getUpdateTime(){return this.updateTime;}

    public void setCreateUser(String createUser){this.createUser = createUser;}

    public String getCreateUser(){return this.createUser;}

    public void setUpdateUser(String updateUser){this.updateUser = updateUser;}

    public String getUpdateUser(){return this.updateUser;}
    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                "articleTitle='" + articleTitle + '\'' +
                "articleDescribe='" + articleDescribe + '\'' +
                "articleContent='" + articleContent + '\'' +
                "articleType='" + articleType + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
                "createUser='" + createUser + '\'' +
                "updateUser='" + updateUser + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Article set;

        private ConditionBuilder where;

        public UpdateBuilder set(Article set){
            this.set = set;
            return this;
        }

        public Article getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Article{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> articleIdList;

        public List<Integer> getArticleIdList(){return this.articleIdList;}

        private Integer articleIdSt;

        private Integer articleIdEd;

        public Integer getArticleIdSt(){return this.articleIdSt;}

        public Integer getArticleIdEd(){return this.articleIdEd;}

        private List<String> articleTitleList;

        public List<String> getArticleTitleList(){return this.articleTitleList;}


        private List<String> fuzzyArticleTitle;

        public List<String> getFuzzyArticleTitle(){return this.fuzzyArticleTitle;}

        private List<String> rightFuzzyArticleTitle;

        public List<String> getRightFuzzyArticleTitle(){return this.rightFuzzyArticleTitle;}
        private List<String> articleDescribeList;

        public List<String> getArticleDescribeList(){return this.articleDescribeList;}


        private List<String> fuzzyArticleDescribe;

        public List<String> getFuzzyArticleDescribe(){return this.fuzzyArticleDescribe;}

        private List<String> rightFuzzyArticleDescribe;

        public List<String> getRightFuzzyArticleDescribe(){return this.rightFuzzyArticleDescribe;}
        private List<String> articleContentList;

        public List<String> getArticleContentList(){return this.articleContentList;}


        private List<String> fuzzyArticleContent;

        public List<String> getFuzzyArticleContent(){return this.fuzzyArticleContent;}

        private List<String> rightFuzzyArticleContent;

        public List<String> getRightFuzzyArticleContent(){return this.rightFuzzyArticleContent;}
        private List<String> articleTypeList;

        public List<String> getArticleTypeList(){return this.articleTypeList;}


        private List<String> fuzzyArticleType;

        public List<String> getFuzzyArticleType(){return this.fuzzyArticleType;}

        private List<String> rightFuzzyArticleType;

        public List<String> getRightFuzzyArticleType(){return this.rightFuzzyArticleType;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<String> createUserList;

        public List<String> getCreateUserList(){return this.createUserList;}


        private List<String> fuzzyCreateUser;

        public List<String> getFuzzyCreateUser(){return this.fuzzyCreateUser;}

        private List<String> rightFuzzyCreateUser;

        public List<String> getRightFuzzyCreateUser(){return this.rightFuzzyCreateUser;}
        private List<String> updateUserList;

        public List<String> getUpdateUserList(){return this.updateUserList;}


        private List<String> fuzzyUpdateUser;

        public List<String> getFuzzyUpdateUser(){return this.fuzzyUpdateUser;}

        private List<String> rightFuzzyUpdateUser;

        public List<String> getRightFuzzyUpdateUser(){return this.rightFuzzyUpdateUser;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder articleIdBetWeen(Integer articleIdSt,Integer articleIdEd){
            this.articleIdSt = articleIdSt;
            this.articleIdEd = articleIdEd;
            return this;
        }

        public QueryBuilder articleIdGreaterEqThan(Integer articleIdSt){
            this.articleIdSt = articleIdSt;
            return this;
        }
        public QueryBuilder articleIdLessEqThan(Integer articleIdEd){
            this.articleIdEd = articleIdEd;
            return this;
        }


        public QueryBuilder articleId(Integer articleId){
            setArticleId(articleId);
            return this;
        }

        public QueryBuilder articleIdList(Integer ... articleId){
            this.articleIdList = solveNullList(articleId);
            return this;
        }

        public QueryBuilder articleIdList(List<Integer> articleId){
            this.articleIdList = articleId;
            return this;
        }

        public QueryBuilder fetchArticleId(){
            setFetchFields("fetchFields","articleId");
            return this;
        }

        public QueryBuilder excludeArticleId(){
            setFetchFields("excludeFields","articleId");
            return this;
        }

        public QueryBuilder fuzzyArticleTitle (List<String> fuzzyArticleTitle){
            this.fuzzyArticleTitle = fuzzyArticleTitle;
            return this;
        }

        public QueryBuilder fuzzyArticleTitle (String ... fuzzyArticleTitle){
            this.fuzzyArticleTitle = solveNullList(fuzzyArticleTitle);
            return this;
        }

        public QueryBuilder rightFuzzyArticleTitle (List<String> rightFuzzyArticleTitle){
            this.rightFuzzyArticleTitle = rightFuzzyArticleTitle;
            return this;
        }

        public QueryBuilder rightFuzzyArticleTitle (String ... rightFuzzyArticleTitle){
            this.rightFuzzyArticleTitle = solveNullList(rightFuzzyArticleTitle);
            return this;
        }

        public QueryBuilder articleTitle(String articleTitle){
            setArticleTitle(articleTitle);
            return this;
        }

        public QueryBuilder articleTitleList(String ... articleTitle){
            this.articleTitleList = solveNullList(articleTitle);
            return this;
        }

        public QueryBuilder articleTitleList(List<String> articleTitle){
            this.articleTitleList = articleTitle;
            return this;
        }

        public QueryBuilder fetchArticleTitle(){
            setFetchFields("fetchFields","articleTitle");
            return this;
        }

        public QueryBuilder excludeArticleTitle(){
            setFetchFields("excludeFields","articleTitle");
            return this;
        }

        public QueryBuilder fuzzyArticleDescribe (List<String> fuzzyArticleDescribe){
            this.fuzzyArticleDescribe = fuzzyArticleDescribe;
            return this;
        }

        public QueryBuilder fuzzyArticleDescribe (String ... fuzzyArticleDescribe){
            this.fuzzyArticleDescribe = solveNullList(fuzzyArticleDescribe);
            return this;
        }

        public QueryBuilder rightFuzzyArticleDescribe (List<String> rightFuzzyArticleDescribe){
            this.rightFuzzyArticleDescribe = rightFuzzyArticleDescribe;
            return this;
        }

        public QueryBuilder rightFuzzyArticleDescribe (String ... rightFuzzyArticleDescribe){
            this.rightFuzzyArticleDescribe = solveNullList(rightFuzzyArticleDescribe);
            return this;
        }

        public QueryBuilder articleDescribe(String articleDescribe){
            setArticleDescribe(articleDescribe);
            return this;
        }

        public QueryBuilder articleDescribeList(String ... articleDescribe){
            this.articleDescribeList = solveNullList(articleDescribe);
            return this;
        }

        public QueryBuilder articleDescribeList(List<String> articleDescribe){
            this.articleDescribeList = articleDescribe;
            return this;
        }

        public QueryBuilder fetchArticleDescribe(){
            setFetchFields("fetchFields","articleDescribe");
            return this;
        }

        public QueryBuilder excludeArticleDescribe(){
            setFetchFields("excludeFields","articleDescribe");
            return this;
        }

        public QueryBuilder fuzzyArticleContent (List<String> fuzzyArticleContent){
            this.fuzzyArticleContent = fuzzyArticleContent;
            return this;
        }

        public QueryBuilder fuzzyArticleContent (String ... fuzzyArticleContent){
            this.fuzzyArticleContent = solveNullList(fuzzyArticleContent);
            return this;
        }

        public QueryBuilder rightFuzzyArticleContent (List<String> rightFuzzyArticleContent){
            this.rightFuzzyArticleContent = rightFuzzyArticleContent;
            return this;
        }

        public QueryBuilder rightFuzzyArticleContent (String ... rightFuzzyArticleContent){
            this.rightFuzzyArticleContent = solveNullList(rightFuzzyArticleContent);
            return this;
        }

        public QueryBuilder articleContent(String articleContent){
            setArticleContent(articleContent);
            return this;
        }

        public QueryBuilder articleContentList(String ... articleContent){
            this.articleContentList = solveNullList(articleContent);
            return this;
        }

        public QueryBuilder articleContentList(List<String> articleContent){
            this.articleContentList = articleContent;
            return this;
        }

        public QueryBuilder fetchArticleContent(){
            setFetchFields("fetchFields","articleContent");
            return this;
        }

        public QueryBuilder excludeArticleContent(){
            setFetchFields("excludeFields","articleContent");
            return this;
        }

        public QueryBuilder fuzzyArticleType (List<String> fuzzyArticleType){
            this.fuzzyArticleType = fuzzyArticleType;
            return this;
        }

        public QueryBuilder fuzzyArticleType (String ... fuzzyArticleType){
            this.fuzzyArticleType = solveNullList(fuzzyArticleType);
            return this;
        }

        public QueryBuilder rightFuzzyArticleType (List<String> rightFuzzyArticleType){
            this.rightFuzzyArticleType = rightFuzzyArticleType;
            return this;
        }

        public QueryBuilder rightFuzzyArticleType (String ... rightFuzzyArticleType){
            this.rightFuzzyArticleType = solveNullList(rightFuzzyArticleType);
            return this;
        }

        public QueryBuilder articleType(String articleType){
            setArticleType(articleType);
            return this;
        }

        public QueryBuilder articleTypeList(String ... articleType){
            this.articleTypeList = solveNullList(articleType);
            return this;
        }

        public QueryBuilder articleTypeList(List<String> articleType){
            this.articleTypeList = articleType;
            return this;
        }

        public QueryBuilder fetchArticleType(){
            setFetchFields("fetchFields","articleType");
            return this;
        }

        public QueryBuilder excludeArticleType(){
            setFetchFields("excludeFields","articleType");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(String createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(String updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder fuzzyCreateUser (List<String> fuzzyCreateUser){
            this.fuzzyCreateUser = fuzzyCreateUser;
            return this;
        }

        public QueryBuilder fuzzyCreateUser (String ... fuzzyCreateUser){
            this.fuzzyCreateUser = solveNullList(fuzzyCreateUser);
            return this;
        }

        public QueryBuilder rightFuzzyCreateUser (List<String> rightFuzzyCreateUser){
            this.rightFuzzyCreateUser = rightFuzzyCreateUser;
            return this;
        }

        public QueryBuilder rightFuzzyCreateUser (String ... rightFuzzyCreateUser){
            this.rightFuzzyCreateUser = solveNullList(rightFuzzyCreateUser);
            return this;
        }

        public QueryBuilder createUser(String createUser){
            setCreateUser(createUser);
            return this;
        }

        public QueryBuilder createUserList(String ... createUser){
            this.createUserList = solveNullList(createUser);
            return this;
        }

        public QueryBuilder createUserList(List<String> createUser){
            this.createUserList = createUser;
            return this;
        }

        public QueryBuilder fetchCreateUser(){
            setFetchFields("fetchFields","createUser");
            return this;
        }

        public QueryBuilder excludeCreateUser(){
            setFetchFields("excludeFields","createUser");
            return this;
        }

        public QueryBuilder fuzzyUpdateUser (List<String> fuzzyUpdateUser){
            this.fuzzyUpdateUser = fuzzyUpdateUser;
            return this;
        }

        public QueryBuilder fuzzyUpdateUser (String ... fuzzyUpdateUser){
            this.fuzzyUpdateUser = solveNullList(fuzzyUpdateUser);
            return this;
        }

        public QueryBuilder rightFuzzyUpdateUser (List<String> rightFuzzyUpdateUser){
            this.rightFuzzyUpdateUser = rightFuzzyUpdateUser;
            return this;
        }

        public QueryBuilder rightFuzzyUpdateUser (String ... rightFuzzyUpdateUser){
            this.rightFuzzyUpdateUser = solveNullList(rightFuzzyUpdateUser);
            return this;
        }

        public QueryBuilder updateUser(String updateUser){
            setUpdateUser(updateUser);
            return this;
        }

        public QueryBuilder updateUserList(String ... updateUser){
            this.updateUserList = solveNullList(updateUser);
            return this;
        }

        public QueryBuilder updateUserList(List<String> updateUser){
            this.updateUserList = updateUser;
            return this;
        }

        public QueryBuilder fetchUpdateUser(){
            setFetchFields("fetchFields","updateUser");
            return this;
        }

        public QueryBuilder excludeUpdateUser(){
            setFetchFields("excludeFields","updateUser");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Article build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> articleIdList;

        public List<Integer> getArticleIdList(){return this.articleIdList;}

        private Integer articleIdSt;

        private Integer articleIdEd;

        public Integer getArticleIdSt(){return this.articleIdSt;}

        public Integer getArticleIdEd(){return this.articleIdEd;}

        private List<String> articleTitleList;

        public List<String> getArticleTitleList(){return this.articleTitleList;}


        private List<String> fuzzyArticleTitle;

        public List<String> getFuzzyArticleTitle(){return this.fuzzyArticleTitle;}

        private List<String> rightFuzzyArticleTitle;

        public List<String> getRightFuzzyArticleTitle(){return this.rightFuzzyArticleTitle;}
        private List<String> articleDescribeList;

        public List<String> getArticleDescribeList(){return this.articleDescribeList;}


        private List<String> fuzzyArticleDescribe;

        public List<String> getFuzzyArticleDescribe(){return this.fuzzyArticleDescribe;}

        private List<String> rightFuzzyArticleDescribe;

        public List<String> getRightFuzzyArticleDescribe(){return this.rightFuzzyArticleDescribe;}
        private List<String> articleContentList;

        public List<String> getArticleContentList(){return this.articleContentList;}


        private List<String> fuzzyArticleContent;

        public List<String> getFuzzyArticleContent(){return this.fuzzyArticleContent;}

        private List<String> rightFuzzyArticleContent;

        public List<String> getRightFuzzyArticleContent(){return this.rightFuzzyArticleContent;}
        private List<String> articleTypeList;

        public List<String> getArticleTypeList(){return this.articleTypeList;}


        private List<String> fuzzyArticleType;

        public List<String> getFuzzyArticleType(){return this.fuzzyArticleType;}

        private List<String> rightFuzzyArticleType;

        public List<String> getRightFuzzyArticleType(){return this.rightFuzzyArticleType;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<String> createUserList;

        public List<String> getCreateUserList(){return this.createUserList;}


        private List<String> fuzzyCreateUser;

        public List<String> getFuzzyCreateUser(){return this.fuzzyCreateUser;}

        private List<String> rightFuzzyCreateUser;

        public List<String> getRightFuzzyCreateUser(){return this.rightFuzzyCreateUser;}
        private List<String> updateUserList;

        public List<String> getUpdateUserList(){return this.updateUserList;}


        private List<String> fuzzyUpdateUser;

        public List<String> getFuzzyUpdateUser(){return this.fuzzyUpdateUser;}

        private List<String> rightFuzzyUpdateUser;

        public List<String> getRightFuzzyUpdateUser(){return this.rightFuzzyUpdateUser;}

        public ConditionBuilder articleIdBetWeen(Integer articleIdSt,Integer articleIdEd){
            this.articleIdSt = articleIdSt;
            this.articleIdEd = articleIdEd;
            return this;
        }

        public ConditionBuilder articleIdGreaterEqThan(Integer articleIdSt){
            this.articleIdSt = articleIdSt;
            return this;
        }
        public ConditionBuilder articleIdLessEqThan(Integer articleIdEd){
            this.articleIdEd = articleIdEd;
            return this;
        }


        public ConditionBuilder articleIdList(Integer ... articleId){
            this.articleIdList = solveNullList(articleId);
            return this;
        }

        public ConditionBuilder articleIdList(List<Integer> articleId){
            this.articleIdList = articleId;
            return this;
        }

        public ConditionBuilder fuzzyArticleTitle (List<String> fuzzyArticleTitle){
            this.fuzzyArticleTitle = fuzzyArticleTitle;
            return this;
        }

        public ConditionBuilder fuzzyArticleTitle (String ... fuzzyArticleTitle){
            this.fuzzyArticleTitle = solveNullList(fuzzyArticleTitle);
            return this;
        }

        public ConditionBuilder rightFuzzyArticleTitle (List<String> rightFuzzyArticleTitle){
            this.rightFuzzyArticleTitle = rightFuzzyArticleTitle;
            return this;
        }

        public ConditionBuilder rightFuzzyArticleTitle (String ... rightFuzzyArticleTitle){
            this.rightFuzzyArticleTitle = solveNullList(rightFuzzyArticleTitle);
            return this;
        }

        public ConditionBuilder articleTitleList(String ... articleTitle){
            this.articleTitleList = solveNullList(articleTitle);
            return this;
        }

        public ConditionBuilder articleTitleList(List<String> articleTitle){
            this.articleTitleList = articleTitle;
            return this;
        }

        public ConditionBuilder fuzzyArticleDescribe (List<String> fuzzyArticleDescribe){
            this.fuzzyArticleDescribe = fuzzyArticleDescribe;
            return this;
        }

        public ConditionBuilder fuzzyArticleDescribe (String ... fuzzyArticleDescribe){
            this.fuzzyArticleDescribe = solveNullList(fuzzyArticleDescribe);
            return this;
        }

        public ConditionBuilder rightFuzzyArticleDescribe (List<String> rightFuzzyArticleDescribe){
            this.rightFuzzyArticleDescribe = rightFuzzyArticleDescribe;
            return this;
        }

        public ConditionBuilder rightFuzzyArticleDescribe (String ... rightFuzzyArticleDescribe){
            this.rightFuzzyArticleDescribe = solveNullList(rightFuzzyArticleDescribe);
            return this;
        }

        public ConditionBuilder articleDescribeList(String ... articleDescribe){
            this.articleDescribeList = solveNullList(articleDescribe);
            return this;
        }

        public ConditionBuilder articleDescribeList(List<String> articleDescribe){
            this.articleDescribeList = articleDescribe;
            return this;
        }

        public ConditionBuilder fuzzyArticleContent (List<String> fuzzyArticleContent){
            this.fuzzyArticleContent = fuzzyArticleContent;
            return this;
        }

        public ConditionBuilder fuzzyArticleContent (String ... fuzzyArticleContent){
            this.fuzzyArticleContent = solveNullList(fuzzyArticleContent);
            return this;
        }

        public ConditionBuilder rightFuzzyArticleContent (List<String> rightFuzzyArticleContent){
            this.rightFuzzyArticleContent = rightFuzzyArticleContent;
            return this;
        }

        public ConditionBuilder rightFuzzyArticleContent (String ... rightFuzzyArticleContent){
            this.rightFuzzyArticleContent = solveNullList(rightFuzzyArticleContent);
            return this;
        }

        public ConditionBuilder articleContentList(String ... articleContent){
            this.articleContentList = solveNullList(articleContent);
            return this;
        }

        public ConditionBuilder articleContentList(List<String> articleContent){
            this.articleContentList = articleContent;
            return this;
        }

        public ConditionBuilder fuzzyArticleType (List<String> fuzzyArticleType){
            this.fuzzyArticleType = fuzzyArticleType;
            return this;
        }

        public ConditionBuilder fuzzyArticleType (String ... fuzzyArticleType){
            this.fuzzyArticleType = solveNullList(fuzzyArticleType);
            return this;
        }

        public ConditionBuilder rightFuzzyArticleType (List<String> rightFuzzyArticleType){
            this.rightFuzzyArticleType = rightFuzzyArticleType;
            return this;
        }

        public ConditionBuilder rightFuzzyArticleType (String ... rightFuzzyArticleType){
            this.rightFuzzyArticleType = solveNullList(rightFuzzyArticleType);
            return this;
        }

        public ConditionBuilder articleTypeList(String ... articleType){
            this.articleTypeList = solveNullList(articleType);
            return this;
        }

        public ConditionBuilder articleTypeList(List<String> articleType){
            this.articleTypeList = articleType;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder fuzzyCreateUser (List<String> fuzzyCreateUser){
            this.fuzzyCreateUser = fuzzyCreateUser;
            return this;
        }

        public ConditionBuilder fuzzyCreateUser (String ... fuzzyCreateUser){
            this.fuzzyCreateUser = solveNullList(fuzzyCreateUser);
            return this;
        }

        public ConditionBuilder rightFuzzyCreateUser (List<String> rightFuzzyCreateUser){
            this.rightFuzzyCreateUser = rightFuzzyCreateUser;
            return this;
        }

        public ConditionBuilder rightFuzzyCreateUser (String ... rightFuzzyCreateUser){
            this.rightFuzzyCreateUser = solveNullList(rightFuzzyCreateUser);
            return this;
        }

        public ConditionBuilder createUserList(String ... createUser){
            this.createUserList = solveNullList(createUser);
            return this;
        }

        public ConditionBuilder createUserList(List<String> createUser){
            this.createUserList = createUser;
            return this;
        }

        public ConditionBuilder fuzzyUpdateUser (List<String> fuzzyUpdateUser){
            this.fuzzyUpdateUser = fuzzyUpdateUser;
            return this;
        }

        public ConditionBuilder fuzzyUpdateUser (String ... fuzzyUpdateUser){
            this.fuzzyUpdateUser = solveNullList(fuzzyUpdateUser);
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateUser (List<String> rightFuzzyUpdateUser){
            this.rightFuzzyUpdateUser = rightFuzzyUpdateUser;
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateUser (String ... rightFuzzyUpdateUser){
            this.rightFuzzyUpdateUser = solveNullList(rightFuzzyUpdateUser);
            return this;
        }

        public ConditionBuilder updateUserList(String ... updateUser){
            this.updateUserList = solveNullList(updateUser);
            return this;
        }

        public ConditionBuilder updateUserList(List<String> updateUser){
            this.updateUserList = updateUser;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Article obj;

        public Builder(){
            this.obj = new Article();
        }

        public Builder articleId(Integer articleId){
            this.obj.setArticleId(articleId);
            return this;
        }
        public Builder articleTitle(String articleTitle){
            this.obj.setArticleTitle(articleTitle);
            return this;
        }
        public Builder articleDescribe(String articleDescribe){
            this.obj.setArticleDescribe(articleDescribe);
            return this;
        }
        public Builder articleContent(String articleContent){
            this.obj.setArticleContent(articleContent);
            return this;
        }
        public Builder articleType(String articleType){
            this.obj.setArticleType(articleType);
            return this;
        }
        public Builder createTime(String createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(String updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Builder createUser(String createUser){
            this.obj.setCreateUser(createUser);
            return this;
        }
        public Builder updateUser(String updateUser){
            this.obj.setUpdateUser(updateUser);
            return this;
        }
        public Article build(){return obj;}
    }

}
