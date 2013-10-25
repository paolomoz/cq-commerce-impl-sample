package com.adobe.training;

import java.util.List;

import com.adobe.cq.commerce.common.ServiceContext;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

import com.adobe.cq.commerce.api.CommerceException;
import com.adobe.cq.commerce.api.CommerceQuery;
import com.adobe.cq.commerce.api.CommerceResult;
import com.adobe.cq.commerce.api.CommerceService;
import com.adobe.cq.commerce.api.CommerceSession;
import com.adobe.cq.commerce.api.Product;
import com.adobe.cq.commerce.api.promotion.Voucher;
import com.adobe.cq.commerce.common.AbstractJcrCommerceService;
import com.adobe.cq.commerce.common.AbstractJcrCommerceServiceFactory;
import com.adobe.cq.commerce.common.AbstractJcrProduct;

public class TrainingCommerceServiceImpl extends AbstractJcrCommerceService implements CommerceService {
    
	private Resource resource;
    private ResourceResolver resolver;
    
    public TrainingCommerceServiceImpl(ServiceContext serviceContext, Resource res) {
        super(serviceContext);
        this.resource = res;
        this.resolver = res.getResourceResolver();
    }

	public CommerceSession login(SlingHttpServletRequest request,
			SlingHttpServletResponse response) throws CommerceException {
		return new TrainingCommerceSessionImpl(this, request, response, resource);
	}

    public Product getProduct(final String path) throws CommerceException {
        Resource resource = resolver.getResource(path);
        if (resource != null && resource.isResourceType(AbstractJcrProduct.RESOURCE_TYPE_PRODUCT)) {
            return new TrainingProductImpl(resource);
        }
        return null;
    }

	public List<String> getCountries() throws CommerceException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getCreditCardTypes() throws CommerceException {
		// TODO Auto-generated method stub
		return null;
	}

	public Voucher getVoucher(String arg0) throws CommerceException {
		// TODO Auto-generated method stub
		return null;
	}

	public CommerceResult search(CommerceQuery arg0) throws CommerceException {
		// TODO Auto-generated method stub
		return null;
	}

    public boolean isAvailable(String s) {
        return true;
    }
}
