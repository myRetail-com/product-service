package com.myRetail.services.productservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myRetail.services.productservice.model.Product;
import com.myRetail.services.productservice.repo.ProductRepository;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product getProductDetailsbyId(Long id) {
		Optional<Product> product = productRepository.findById(id);
		return product.orElseThrow();
	}

	@Override
	public void updateProductDetailsbyId(Long id, Product product) {
		Product updateproduct = productRepository.findById(id).get();
		updateproduct.setCurrent_price(product.getCurrent_price());
		productRepository.save(updateproduct);
	}
}
