package com.adobe.training;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;

import com.adobe.cq.commerce.api.CommerceException;
import com.adobe.cq.commerce.common.AbstractJcrCommerceService;
import com.adobe.cq.commerce.common.AbstractJcrCommerceSession;

public class TrainingCommerceSessionImpl extends AbstractJcrCommerceSession {

	public TrainingCommerceSessionImpl(
			AbstractJcrCommerceService commerceService,
			SlingHttpServletRequest request, SlingHttpServletResponse response,
			Resource resource) throws CommerceException {
		super(commerceService, request, response, resource);
	}
	
}
