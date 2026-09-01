package com.relational.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dept")
public class department {
    @Id
    private int id;
    private String department;

    @OneToMany(mappedBy = "department")

    private List <employee> e;

    public department(int id, String department) {
        this.id = id;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<employee> getE() {
        return e;
    }

    public void setE(List<employee> e) {
        this.e = e;
    }
}
