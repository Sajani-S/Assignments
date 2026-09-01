package com.example.config;


import com.example.service.Productservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Configurations {


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/inventorydb");
        ds.setUsername("root");
        ds.setPassword("sajaninirmala@2143@");
        return ds;
    }
    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public Productservice  productService() {
        Productservice service = new Productservice();
        service.setJdbcTemplate(jdbcTemplate());
        return service;
    }
}
