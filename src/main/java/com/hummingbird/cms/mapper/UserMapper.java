package com.hummingbird.cms.mapper;

import java.util.List;

import com.hummingbird.cms.entity.User;

public interface UserMapper {
    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(User record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(User record);

    /**
     * 根据主键查询记录
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(User record);

	/**
     * 根据手机号码查询用户信息
     */
    List<User> queryUserByMobile(String mobileNum);
}