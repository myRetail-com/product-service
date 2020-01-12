package com.myRetail.services.productservice.model.resp;

import com.myRetail.services.productservice.model.Price;

import lombok.Data;

@Data
public class ProductResp {
	private long id;
	private Price current_price;
	private String name;
}
