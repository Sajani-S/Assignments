package com.example.employeeprotal.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class Configurations {

    @Bean

    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin123")
                .roles("ADMIN")
                .build();


        return new InMemoryUserDetailsManager(user);

    }






}
