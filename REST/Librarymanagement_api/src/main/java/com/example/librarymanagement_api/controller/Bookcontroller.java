package com.example.librarymanagement_api.controller;

import com.example.librarymanagement_api.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Bookcontroller {

    List<Book> b =  new ArrayList<>();

    @PostMapping("/add")
    public String add(@RequestBody Book s){
        b.add(s);
        return "book added";
    }
    @GetMapping("/get")
    public List<Book> get(){
        return b;
    }

    @GetMapping("/get/{id}")

    public Book getbyID(@PathVariable int id){

        for(Book o : b) {
            if (o.getBookId() == id) {
                return o;
            }
        }
       return null;


    }

}
