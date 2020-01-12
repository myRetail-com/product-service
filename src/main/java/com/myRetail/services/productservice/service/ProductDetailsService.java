package com.myRetail.services.productservice.service;

import com.myRetail.services.productservice.model.Product;

public interface ProductDetailsService {
	Product getProductDetailsbyId(Long id);
	void updateProductDetailsbyId(Long id, Product product);
}
