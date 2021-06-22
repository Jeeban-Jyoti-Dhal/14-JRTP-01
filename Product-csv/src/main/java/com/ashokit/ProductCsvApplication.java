package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.ProductService;

@SpringBootApplication
public class ProductCsvApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(ProductCsvApplication.class, args);
		ProductService productService = context.getBean(ProductService.class);
		productService.insertRecord();
	}

}
