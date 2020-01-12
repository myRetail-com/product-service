package com.myRetail.services.productservice.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Product")
public class Product {
	@Id
	private long id;
	private String name;
	private BigDecimal current_price;
}
