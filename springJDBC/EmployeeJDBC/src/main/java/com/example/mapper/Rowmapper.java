package com.example.mapper;

import com.example.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Rowmapper implements RowMapper<Employee> {


    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee E = new Employee();

        E.setEmpid(rs.getInt("emp_id"));
        E.setEmpname(rs.getString("emp_name"));
        E.setDepartment(rs.getString("department"));
        E.setDesignation(rs.getString("designation"));
        E.setSalary(rs.getDouble("salary"));

        return E;
    }
}