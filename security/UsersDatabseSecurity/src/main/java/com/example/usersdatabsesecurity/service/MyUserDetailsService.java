package com.example.usersdatabsesecurity.service;

import com.example.usersdatabsesecurity.entity.Users;
import com.example.usersdatabsesecurity.model.Userprincipal;
import com.example.usersdatabsesecurity.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private Repository repo;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Users user = repo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }

        return new Userprincipal(user);   // Your custom UserPrincipal class
    }
}