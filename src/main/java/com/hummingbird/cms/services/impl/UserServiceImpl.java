package com.hummingbird.cms.services.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hummingbird.common.exception.ValidateException;
import com.hummingbird.common.util.DESUtil;
import com.hummingbird.cms.entity.Token;
import com.hummingbird.cms.entity.User;
import com.hummingbird.cms.entity.UserPassword;
import com.hummingbird.cms.exception.MaAccountException;
import com.hummingbird.cms.mapper.UserMapper;
import com.hummingbird.cms.mapper.UserPasswordMapper;
import com.hummingbird.cms.services.TokenService;
import com.hummingbird.cms.services.UserService;
import com.hummingbird.cms.util.AccountGenerationUtil;
import com.hummingbird.cms.util.AccountValidateUtil;


@Service
public class UserServiceImpl implements UserService{
org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
			.getLog(this.getClass());
	
	@Autowired
	UserMapper userDao;
	@Autowired
	UserPasswordMapper passwordDao;
	@Autowired(required = true)
	private TokenService tokensrv;
	
	@Override
	public User queryUserByMobile(String mobileNum) throws MaAccountException{
		List<User> users=userDao.queryUserByMobile(mobileNum);
		
		if(users.size()>1){
			if (log.isDebugEnabled()) {
				log.debug(String.format("根据手机号[%s]查询到多个用户",mobileNum));
			}
			throw new MaAccountException(MaAccountException.ERR_ACCOUNT_EXCEPTION,"根据手机号查询到多个用户");
		
		}
		return users.size()==0?null:users.get(0);
	}

	@Override
	public User queryUserByToken(String token) throws MaAccountException{
		Token userToken = tokensrv.getToken(token);
		if(userToken!=null){
			User user = userDao.selectByPrimaryKey(userToken.getUserId());
			if(user==null)
			{
				if (log.isDebugEnabled()) {
					log.debug(String.format("根据用户id[%s]查找不到用户",userToken.getUserId()));
				}
				throw new MaAccountException(MaAccountException.ERR_ACCOUNT_EXCEPTION,String.format("根据用户id[%s]查找不到用户",userToken.getUserId()));
				
			}
			else{
				return user;			
			}
		}
		else{
			if (log.isDebugEnabled()) {
				log.debug(String.format("token[%s]无效",token));
			}
			throw new MaAccountException(MaAccountException.ERR_ACCOUNT_EXCEPTION,String.format("token[%s]无效或已过期,请重新登录",token));
			
		}
	}

	@Override
	public User getUser(Integer userId) throws MaAccountException {
		
		return userDao.selectByPrimaryKey(userId);
	}

	
	
	

}
