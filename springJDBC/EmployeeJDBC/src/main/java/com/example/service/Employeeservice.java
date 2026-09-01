package com.example.service;

import com.example.mapper.Rowmapper;
import com.example.model.Employee;
import com.example.repository.Employeerepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Employeeservice implements Employeerepository {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }




    public void addEmployee() {
        String sql = "insert into employees values(?,?,?,?,?)";
        int result = jdbcTemplate.update(
                sql,
                109,
                "kathir",
                "IT",
                "front end specialist",
                68000
        );

        System.out.println(result + " Row Inserted");
    }

    @Override
    public void updateEmployee() {

        String sql = "update employees set emp_name=?, department=?, designation=?, salary=? where emp_id=?";

        int result = jdbcTemplate.update(
                sql,
                "meena",
                "HR",
                "full stack developer",
                80000,
                108
        );

        System.out.println(result + " Row Updated");
        System.out.println();

    }

    @Override
    public void deleteEmployee() {

        String sql = "delete from employees where emp_id=?";

        int result = jdbcTemplate.update(sql, 102);

        System.out.println(result + " Row Deleted");
        System.out.println();

    }

    @Override
    public void findEmployeeById() {

        String sql = "select * from employees where emp_id=?";

        Employee s = jdbcTemplate.queryForObject(
                sql,
                new Rowmapper(),
                101
        );

        System.out.println(s);
        System.out.println();

    }

    public void displayAllEmployees() {

        String sql = "select * from employees";

        List<Employee> employeeList = jdbcTemplate.query(
                sql,
                new Rowmapper()
        );

        for (Employee d : employeeList) {
            System.out.println(d);
        }
        System.out.println();

    }

    public void filterbysalary(){

        System.out.println("employees details whose salary is greater than ₹50,000 :  ");

        String sql  = "select * from employees where salary >50000 ";
        List<Employee> employeeList = jdbcTemplate.query(
                sql,
                new Rowmapper()
        );

        for (Employee t : employeeList) {
            System.out.println(t);
        }







        
    }
}