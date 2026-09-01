package com.demo.entity;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

      @Id
       private int  id;
      private String name;
       @Embedded
       private address a;

      public Employee(){}
    public Employee(int id,String name,address a){

          this.id =id ;
        this.name = name ;
          this.a = a;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public address getA() {
        return a;
    }

    public void setA(address a) {
        this.a = a;
    }
}
