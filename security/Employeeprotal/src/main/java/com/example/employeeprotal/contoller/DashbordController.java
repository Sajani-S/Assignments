package com.example.employeeprotal.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashbordController {

    @GetMapping("/dashboard")
    public String get(){
        return "welcomme to dashboard";
    }


}
