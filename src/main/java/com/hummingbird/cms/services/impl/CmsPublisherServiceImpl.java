package com.hummingbird.cms.services.impl;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hummingbird.common.exception.BusinessException;
import com.hummingbird.common.util.ValidateUtil;
import com.hummingbird.PopGenerator.BeanModel;
import com.hummingbird.PopGenerator.PopGenertorUtils;
import com.hummingbird.cms.entity.Document;
import com.hummingbird.cms.entity.DocumentArticle;
import com.hummingbird.cms.mapper.CategoryMapper;
import com.hummingbird.cms.mapper.DocumentArticleMapper;
import com.hummingbird.cms.mapper.DocumentMapper;
import com.hummingbird.cms.mapper.UserMapper;
import com.hummingbird.cms.services.CmsPublisherService;


@Service
public class CmsPublisherServiceImpl implements CmsPublisherService{
org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
			.getLog(this.getClass());
	
	@Autowired
	DocumentMapper docDao;
	@Autowired
	DocumentArticleMapper docMDao;
	@Autowired
	CategoryMapper cateDao;
	@Override
	public void cmsPublish(Integer docId) throws BusinessException {
		// TODO Auto-generated method stub
		Document doc = docDao.selectByPrimaryKey(docId);
		ValidateUtil.assertNull(doc, "文档");
		DocumentArticle docM = docMDao.selectByPrimaryKey(docId);
		if(docM != null){
			String name = doc.getName();
			BeanModel bm = new BeanModel();
			
			bm.setName(String.valueOf(doc.getId()));
			bm.setDocName(name);
			bm.setTitle(doc.getTitle());
			bm.setCategoryId(doc.getCategoryId());
			bm.setContent(docM.getContent());
			PopGenertorUtils beanUtils = new PopGenertorUtils(bm);
	        try {
				beanUtils.createSuite(new File("e:"));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
