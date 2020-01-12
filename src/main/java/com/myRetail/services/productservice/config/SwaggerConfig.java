package com.myRetail.services.productservice.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	private static final String BASE_PACKAGE = "com.myRetail.services.productservice.controller";

	@Bean
	public Docket productapi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("Product Service",
				"This service provides the product details Apis for a given product id", "1.0",
				"https://www.myRetails.com",
				new springfox.documentation.service.Contact("Product-Service", "", "Product_Service@MyRetail.com"),
				"", "", Collections.emptyList());
	}
}
