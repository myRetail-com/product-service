package com.myRetail.services.productservice.exception;

import lombok.Generated;

@Generated
public class ProductNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

    public ProductNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
