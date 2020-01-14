package com.myRetail.services.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myRetail.services.productservice.model.Price;
import com.myRetail.services.productservice.model.Product;
import com.myRetail.services.productservice.model.resp.CurrentPrice;
import com.myRetail.services.productservice.model.resp.ProductResp;
import com.myRetail.services.productservice.repo.PriceRepository;
import com.myRetail.services.productservice.repo.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired 
	PriceRepository priceRepository;

	@Override
	public ProductResp getProductDetailsbyId(Long id) {
		Product product = productRepository.findById(id).get();
		log.info("product#####" +product);
		Price price = priceRepository.findById(id).get();
		log.info("currentPrice##### " +price);
		ProductResp productResp = new ProductResp();
		productResp.setId(id);
		productResp.setName(product.getName());
		CurrentPrice current_price = new CurrentPrice();
		current_price.setValue(price.getValue());
		current_price.setCurrency_code(price.getCurrency_code());
		productResp.setCurrent_price(current_price);		
		return productResp;
	}

	@Override
	public void updateProductDetailsbyId(Long id, Price price) {
		Price updatePrice = priceRepository.findById(id).get();
		updatePrice.setValue(price.getValue());
		priceRepository.save(updatePrice);
	}
}
