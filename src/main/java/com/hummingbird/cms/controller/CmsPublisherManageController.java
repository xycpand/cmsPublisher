package com.hummingbird.cms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hummingbird.cms.entity.AppLog;
import com.hummingbird.cms.entity.Token;
import com.hummingbird.cms.entity.User;
import com.hummingbird.cms.event.DrawalsEvent;
import com.hummingbird.cms.event.RechargeEvent;
import com.hummingbird.cms.exception.MaAccountException;
import com.hummingbird.cms.face.Account;
import com.hummingbird.cms.mapper.AppLogMapper;
import com.hummingbird.cms.services.TokenService;
import com.hummingbird.cms.services.UserService;
import com.hummingbird.cms.util.MoneyUtil;
import com.hummingbird.cms.vo.TokenBodyVO;
import com.hummingbird.cms.vo.TokenQueryVO;
import com.hummingbird.cms.vo.TokenVO;
import com.hummingbird.cms.vo.UserBodyVO;
import com.hummingbird.common.controller.BaseController;
import com.hummingbird.common.event.EventListenerContainer;
import com.hummingbird.common.event.RequestEvent;
import com.hummingbird.common.exception.ValidateException;
import com.hummingbird.common.ext.AccessRequered;
import com.hummingbird.common.face.AbstractAppLog;
import com.hummingbird.common.face.Pagingnation;
import com.hummingbird.common.util.CollectionTools;
import com.hummingbird.common.util.DateUtil;
import com.hummingbird.common.util.PropertiesUtil;
import com.hummingbird.common.util.RequestUtil;
import com.hummingbird.common.util.ValidateUtil;
import com.hummingbird.common.vo.ResultModel;
import com.hummingbird.commonbiz.exception.TokenException;
import com.hummingbird.commonbiz.service.IAuthenticationService;
import com.hummingbird.commonbiz.vo.BaseTransVO;

@Controller

@RequestMapping("/cmsPublisherManage")
public class CmsPublisherManageController extends BaseController{
	@Autowired 
	UserService userSer;
	@Autowired
	IAuthenticationService authService;
	@Autowired
	AppLogMapper applogDao;
	@Autowired
	TokenService tokenSrv;


	/**
	 * 接口样例    
	 * @author 
	 * @since 2015-11-18 16:48:09
	 * @return
	 */
	@RequestMapping(value = "/queryMyCapitalSurvey", method = RequestMethod.POST)
	@AccessRequered(methodName = "查询我的资金账户概况",isJson=false,codebase=251100,appLog=true,convert2javabean=false)
	public @ResponseBody Object queryMyCapitalSurvey(HttpServletRequest request) {
		
		TokenVO transorder;
		ResultModel rm = super.getResultModel();
		try {
			String jsonstr = RequestUtil.getRequestPostData(request);
			request.setAttribute("rawjson", jsonstr);
			transorder = RequestUtil.convertJson2Obj(jsonstr, TokenVO.class);
		} catch (Exception e) {
			log.error(String.format("获取订单参数出错"),e);
			rm.mergeException(ValidateException.ERROR_PARAM_FORMAT_ERROR.cloneAndAppend(null, "订单参数"));
			return rm;
		}
		
		String messagebase = "查询我的资金账户概况";
		rm.setBaseErrorCode(251100);
		rm.setErrmsg(messagebase+"成功");
		try {
			//获取url以作为method的内容
			String requestURI = request.getRequestURI();
			requestURI=requestURI.replace(request.getContextPath(), "");
			
			if(log.isDebugEnabled()){
				log.debug("检验通过，获取请求");
			}
			Token token = tokenSrv.getToken(transorder.getBody().getToken(), transorder.getApp().getAppId());
			if (token == null) {
				log.error(String.format("token[%s]验证失败,或已过期,请重新登录", transorder.getBody().getToken()));
				throw new TokenException("token验证失败,或已过期,请重新登录");
			}
			
			
			rm.put("myCapitalInfo","");
			tokenSrv.postponeToken(token);
		} catch (Exception e1) {
			log.error(String.format(messagebase+"失败"),e1);
			rm.mergeException(e1);
			rm.setErrmsg(messagebase+"失败,"+rm.getErrmsg());
		}
		return rm;
	}
	
}
