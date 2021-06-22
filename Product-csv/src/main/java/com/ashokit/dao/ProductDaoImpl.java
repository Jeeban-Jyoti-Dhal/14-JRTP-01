package com.ashokit.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashokit.util.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private static final String qry = "insert into oeja3.product(pid,pname,price) values(?,?,?)";
	private JdbcTemplate jdbc;

	public ProductDaoImpl(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public void insert(Product p) {
		jdbc.update(qry, p.getPid(), p.getPname(), p.getPrice());
	}

}
