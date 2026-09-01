package com.relational.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class employee {

    @Id
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "department_name")
    private department department;


    public employee(int id, String name, department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public department getDepartment() {
        return department;
    }

    public void setDepartment(department department) {
        this.department = department;
    }
}