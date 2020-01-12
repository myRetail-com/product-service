package com.myRetail.services.productservice.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.Data;

@Data
public class Price {
	private BigDecimal value;
	private String currency_code;
}
