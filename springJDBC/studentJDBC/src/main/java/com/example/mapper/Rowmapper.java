package com.example.mapper;

import com.example.model.Student;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Rowmapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();

        student.setStudentId(rs.getInt("student_id"));
        student.setStudentName(rs.getString("student_name"));
        student.setEmail(rs.getString("email"));
        student.setCourse(rs.getString("course"));
        student.setMarks(rs.getDouble("marks"));

        return student;
    }
}