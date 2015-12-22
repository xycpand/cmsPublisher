package com.hummingbird.cms.services;


import com.hummingbird.cms.entity.User;
import com.hummingbird.cms.exception.MaAccountException;

public interface UserService {
	/**
	 * 根据手机号查询用户信息
	 * @param mobileNum
	 * @return
	 * @throws MaAccountException
	 */
	public User queryUserByMobile(String mobileNum)throws MaAccountException;
	
	/**
	 * 根据token查询用户信息
	 * @param token
	 * @return
	 * @throws MaAccountException
	 */
	public User queryUserByToken(String token)throws MaAccountException;
	
	/**
	 * 根据用户ID查询用户信息
	 * @param mobileNum
	 * @return
	 * @throws MaAccountException
	 */
	public User getUser(Integer userId)throws MaAccountException;
	
	
}
