package com.example.student_result_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @RequestMapping("/")
    public String home() {
         return"form";
}


     @RequestMapping("/result")
public String getdata(
       @RequestParam("subject1")int sub1,
                @RequestParam("subject2")int sub2,
                        @RequestParam("subject3")int sub3,
                        @RequestParam("subject4")int sub4,
      @RequestParam("subject5")int sub5,
        Model model){

        int total = sub1+sub2+sub3+sub4+sub5;
        int average = total/5;

           model.addAttribute("total",total);
          model.addAttribute("average",average);

     return "result";




}











}
