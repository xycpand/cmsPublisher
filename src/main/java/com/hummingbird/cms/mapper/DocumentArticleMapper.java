package com.hummingbird.cms.mapper;

import com.hummingbird.cms.entity.DocumentArticle;

public interface DocumentArticleMapper {
    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(DocumentArticle record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(DocumentArticle record);

    /**
     * 根据主键查询记录
     */
    DocumentArticle selectByPrimaryKey(Integer id);
   
    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(DocumentArticle record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(DocumentArticle record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(DocumentArticle record);
}