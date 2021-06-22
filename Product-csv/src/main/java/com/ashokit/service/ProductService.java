package com.ashokit.service;

import java.io.File;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.ashokit.dao.ProductDao;
import com.ashokit.util.Product;

@Service
public class ProductService {
	private ProductDao pdao;

	public ProductService(ProductDao pdao) {
		super();
		this.pdao = pdao;
	}

	public void insertRecord() throws Exception {
		Scanner scn = new Scanner(new File("E:\\Products.csv"));
		while (scn.hasNext()) {
			String line = scn.next();
			String[] split = line.split(",");
			System.out.println(line);
			String pid = split[0];
			String pname = split[1];
			String price = split[2];
			
			 Product p=new Product();
			  p.setPid(Integer.parseInt(pid));
			  p.setPname(pname);
			  p.setPrice(Double.parseDouble(price));
			  
			pdao.insert(p);

		}
	}
}
