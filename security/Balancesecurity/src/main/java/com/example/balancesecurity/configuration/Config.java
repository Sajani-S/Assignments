package com.example.balancesecurity.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {

    @Bean

    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("bankuser")

                .password("bank123").roles("USER")
                .build();


        return new InMemoryUserDetailsManager(user);

    }

        @Bean
      public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Throwable{


      http.authorizeHttpRequests(auth->auth.anyRequest().authenticated())


              .httpBasic(httpBasic->{});

      return http.build();






      }

}
