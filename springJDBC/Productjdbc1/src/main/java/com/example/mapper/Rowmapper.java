package com.example.mapper;

import com.example.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Rowmapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product E = new Product();

        E.setProductid(rs.getInt("product_id"));
        E.setProductname(rs.getString("product_name"));
        E.setCategory(rs.getString("category"));
        E.setPrice(rs.getInt("price"));
        E.setQuantity(rs.getInt("quantity"));

        return E;
    }
}
