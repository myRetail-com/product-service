package com.myRetail.services.productservice.service;

import com.myRetail.services.productservice.model.Price;
import com.myRetail.services.productservice.model.resp.ProductResp;

public interface ProductDetailsService {
	ProductResp getProductDetailsbyId(Long id);
	void updateProductDetailsbyId(Long id, Price price);
}
