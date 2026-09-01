package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Studentcontroller {

    @GetMapping("/home")
    public ModelAndView getdata(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","Arun");
        mv.addObject("age","20");

        mv.setViewName("studentprofile");
        return mv;

    }
}
