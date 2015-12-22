package com.hummingbird.cms.mapper;

import com.hummingbird.cms.entity.Category;

public interface CategoryMapper {
    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Category record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Category record);

    /**
     * 根据主键查询记录
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(Category record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Category record);
}