package com.example.service;


import com.example.mapper.Rowmapper;
import com.example.model.Product;
import com.example.repo.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Productservice implements Repository {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void addProduct() {
        String sql = "insert into products values(?,?,?,?,?)";
        int result = jdbcTemplate.update(
                sql,
                16,
                "protein shaker bottle",
                "fitness",
                14.99,
                110
        );

        System.out.println(result + " Row Inserted");
    }

    @Override
    public void updateProduct() {

        String sql = "update products  set product_name=?, category=?, price=?, quantity=? where product_id=?";

        int result = jdbcTemplate.update(
                sql,
                "AC",
                "electronics",
                60000,
                25,
                14
        );

        System.out.println(result + " Row Updated");
        System.out.println();
    }

    @Override
    public void deleteProduct() {

        String sql = "delete from products where product_id=?";

        int result = jdbcTemplate.update(sql, 13);

        System.out.println(result + " Row Deleted");
        System.out.println();

    }

    @Override
    public void findProductById() {
        System.out.println("searching by id  ;");


        String sql = "select * from products where product_id=?";

        Product s = jdbcTemplate.queryForObject(
                sql,
                new Rowmapper(),
                12
        );

        System.out.println(s);
        System.out.println();

    }

    public void displayAllProduct() {
        System.out.println("display all products");

        String sql = "select * from products";

        List<Product> productList = jdbcTemplate.query(
                sql,
                new Rowmapper()
        );

        for (Product d : productList) {
            System.out.println(d);
        }
        System.out.println();

    }

    public void filterbyquantity(){

        System.out.println("product details whose quantity is less than 10:  ");

        String sql  = "select * from products where quantity < 10 ";
        List<Product> productList = jdbcTemplate.query(
                sql,
                new Rowmapper()
        );

        for (Product t : productList) {
            System.out.println(t);
        }
        System.out.println();

    }


   public void findProductByCategory(){
       System.out.println("fing product by category;");

       String sql = "select * from products where category =?";

       List <Product>  s = jdbcTemplate.query(
               sql,
               new Rowmapper(),
               "Apparel"
       );

       for(Product q: s){
           System.out.println(q);
   }
       System.out.println();

   }

    @Override
    public void totalinventory() {
        String sql ="select sum(price * quantity) from products ";
        Double total = jdbcTemplate.queryForObject(sql, Double.class);
         System.out.println("total inventory money : " +  total);
        System.out.println();

    }
}
