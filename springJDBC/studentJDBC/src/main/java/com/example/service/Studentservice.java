package com.example.service;

import com.example.mapper.Rowmapper;
import com.example.model.Student;
import com.example.repository.Studentrepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Studentservice implements Studentrepository {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addStudent() {

        String sql = "insert into students values(?,?,?,?,?)";

        int result = jdbcTemplate.update(
                sql,
                119,
                "Karthik",
                "karthik@gmail.com",
                "Java",
                90
        );

        System.out.println(result + " Row Inserted");
        System.out.println();

    }

    @Override
    public void updateStudent() {

        String sql = "update students set student_name=?, email=?, course=?, marks=? where student_id=?";

        int result = jdbcTemplate.update(
                sql,
                "Karthik Kumar",
                "karthik@gmail.com",
                "Spring",
                95,
                119
        );

        System.out.println(result + " Row Updated");
        System.out.println();

    }

    @Override
    public void deleteStudent() {

        String sql = "delete from students where student_id=?";

        int result = jdbcTemplate.update(sql, 102);

        System.out.println(result + " Row Deleted");
        System.out.println();

    }

    @Override
    public void findStudentById() {

        String sql = "select * from students where student_id=?";

        Student student = jdbcTemplate.queryForObject(
                sql,
                new Rowmapper(),
                101
        );
        System.out.println("searching by id ");

        System.out.println(student);
        System.out.println();

    }
    public void displayAllStudents() {

        String sql = "select * from students";

        List<Student> studentList = jdbcTemplate.query(
                sql,
                new Rowmapper()
        );
        System.out.println("display all students ;  ");

        for (Student student : studentList) {

            System.out.println(student);

        }
        System.out.println();

    }


    }






























