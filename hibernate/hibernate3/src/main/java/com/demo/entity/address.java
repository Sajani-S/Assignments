package com.demo.entity;
import jakarta.persistence.Embeddable;

@Embeddable
public class address {

    private String city;
    private String state;



    public address(){}
    public address(String city,String state){
        this.city =city;
        this.state =state;
    }


    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
