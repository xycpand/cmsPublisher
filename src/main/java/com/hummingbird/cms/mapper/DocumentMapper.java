package com.hummingbird.cms.mapper;

import com.hummingbird.cms.entity.Document;

public interface DocumentMapper {
    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Document record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Document record);

    /**
     * 根据主键查询记录
     */
    Document selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Document record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Document record);
}