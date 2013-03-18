package com.adobe.training;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

import com.adobe.cq.commerce.common.AbstractJcrProduct;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

public class TrainingProductImpl extends AbstractJcrProduct {
    public static final String PN_IDENTIFIER = "identifier";
    public static final String PN_PRICE = "price";

    protected final ResourceResolver resourceResolver;
    protected final PageManager pageManager;
    protected final Page productPage;
    protected String brand = null;

    public TrainingProductImpl(Resource resource) {
        super(resource);

        resourceResolver = resource.getResourceResolver();
        pageManager = resourceResolver.adaptTo(PageManager.class);
        productPage = pageManager.getContainingPage(resource);
    }

	public String getSKU() {
		// TODO Auto-generated method stub
		return "todo-get-sku-method";
	}
}