package com.myRetail.services.productservice.model.resp;

import lombok.Data;

@Data
public class ProductResp {
	private long id;
	private String name;
	private CurrentPrice current_price;
}
