package com.myRetail.services.productservice.model.resp;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CurrentPrice {
	private BigDecimal value;
	private String currency_code;
}
