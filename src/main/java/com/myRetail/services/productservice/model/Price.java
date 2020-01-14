package com.myRetail.services.productservice.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Price")
public class Price {
	@Id
	private long id;
	private BigDecimal value;
	private String currency_code;
}
