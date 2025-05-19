package com.example.ex_beginner;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

    @Autowired
    private ServletContext application;

    @GetMapping("")
    public String index(){
        return "exam03";
    }

    @PostMapping("/calc")
    public String calc(String item1, String item2, String item3){
        int item4 = Integer.parseInt(item1);
        int item5 = Integer.parseInt(item2);
        int item6 = Integer.parseInt(item3);
        int calc = item4 + item5 + item6;
        int calc1 = calc + (int) (calc * 0.1);
        application.setAttribute("calc", calc);
        application.setAttribute("calc1", calc1);
        return "exam03-result";
    }
}
