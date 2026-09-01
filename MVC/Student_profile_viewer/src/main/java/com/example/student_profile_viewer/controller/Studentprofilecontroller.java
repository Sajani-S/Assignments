package com.example.student_profile_viewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Studentprofilecontroller {


    @GetMapping("/profile")
    public ModelAndView getdata(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","Arun");
        mv.addObject("course","Java");

        mv.setViewName("StudentProfile");
        return mv;

    }
}
