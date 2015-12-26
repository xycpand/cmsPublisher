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
import com.hummingbird.cms.services.CmsPublisherService;
import com.hummingbird.cms.services.TokenService;
import com.hummingbird.cms.services.UserService;
import com.hummingbird.cms.util.MoneyUtil;
import com.hummingbird.cms.vo.CmsParaVO;
import com.hummingbird.cms.vo.TokenBodyVO;
import com.hummingbird.cms.vo.TokenQueryVO;
import com.hummingbird.cms.vo.TokenVO;
import com.hummingbird.cms.vo.UserBodyVO;
import com.hummingbird.common.controller.BaseController;
import com.hummingbird.common.event.EventListenerContainer;
import com.hummingbird.common.event.RequestEvent;
import com.hummingbird.common.exception.DataInvalidException;
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

@RequestMapping("/cmsManager")
public class CmsPublisherManageController extends BaseController{
	@Autowired 
	CmsPublisherService cmsSer;
	@Autowired
	AppLogMapper applogDao;


	/**
	 * cms发布系统 
	 * @author YJY
	 * @since 2015年12月22日12:58:57
	 * @return
	 */
	@RequestMapping(value = "/publish", method =RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
	public @ResponseBody Object queryMyCapitalSurvey(HttpServletRequest request) {
		
		CmsParaVO transorder;
		ResultModel rm = super.getResultModel();
		try {
			String jsonstr = RequestUtil.getRequestPostData(request);
			request.setAttribute("rawjson", jsonstr);
			transorder = RequestUtil.convertJson2Obj(jsonstr, CmsParaVO.class);
		} catch (Exception e) {
			log.error(String.format("获取订单参数出错"),e);
			rm.mergeException(ValidateException.ERROR_PARAM_FORMAT_ERROR.cloneAndAppend(null, "订单参数"));
			return rm;
		}
		
		String messagebase = "cms系统发布";
		rm.setBaseErrorCode(961100);
		rm.setErrmsg(messagebase+"成功");
		try {
			Integer docId = transorder.getDocId();
			if(docId == null){
				throw new DataInvalidException(10103, "文档id");
			}
			cmsSer.cmsPublish(docId);
			
		} catch (Exception e1) {
			log.error(String.format(messagebase+"失败"),e1);
			rm.mergeException(e1);
			rm.setErrmsg(messagebase+"失败,"+rm.getErrmsg());
		}
		return rm;
	}
	
}
