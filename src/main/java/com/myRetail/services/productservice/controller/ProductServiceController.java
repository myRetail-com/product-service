package com.myRetail.services.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myRetail.services.productservice.exception.ProductNotFoundException;
import com.myRetail.services.productservice.model.Product;
import com.myRetail.services.productservice.service.ProductDetailsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductServiceController {

	@Autowired
	ProductDetailsService productDetailsService;

	@GetMapping(value = "/products/{id}")
	public Product getProductDetailsbyId(@PathVariable(name = "id") Long id) throws Exception {
		log.info("Product Id received " + id);
		Product productDetails = productDetailsService.getProductDetailsbyId(id);
		if (productDetails == null) {
			StringBuffer errorMessage = new StringBuffer();
			errorMessage.append("Product details are not found for id: ").append(id);
			throw new ProductNotFoundException(errorMessage.toString());
		}
		log.info("@@@ Traverse the logs " + productDetails);
		return productDetails;
	}

	@PutMapping(value = "/products/{id}")
	public ResponseEntity<Object> updateProductDetailsbyId(@PathVariable(name = "id") Long id,
			@RequestBody Product product) throws Exception {
		productDetailsService.updateProductDetailsbyId(id, product);
		log.info("@@@ Traverse the logs " + id +product);
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	}
}
