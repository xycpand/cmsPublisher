package com.hummingbird.cms.services;


import com.hummingbird.common.exception.BusinessException;

public interface CmsPublisherService {
	/**
	 * cms发布文档
	 * @param docId
	 * @return
	 * @throws BusinessException
	 */
	public void cmsPublish(Integer docId)throws BusinessException;
	
	
}
