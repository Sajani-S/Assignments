package com.example.VehicleManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class javaconfig {


    @Bean
    @Primary
    public Vehicle Car(){
        return new Car();
    }
    @Bean
    public Vehicle Engine(){
        return new Engine();
    }
}
