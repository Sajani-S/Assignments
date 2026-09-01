package com.example.libraryaop;

import com.example.libraryaop.service.Librarryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryaopApplication implements CommandLineRunner {

    @Autowired
    private Librarryservice l;
    public static void main(String[] args) {
        SpringApplication.run(LibraryaopApplication.class, args);
    }
   @Override

    public void run(String... args) {

        l.issueBook();





   }
}
