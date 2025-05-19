package com.example.ex_beginner;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @Autowired
    private HttpSession session;

    @GetMapping("")
    public String index(){
        return "exam02";
    }

    @PostMapping("/result")
    public String result(String num1, String num2){
        Integer num3 = Integer.parseInt(num1);
        Integer num4 = Integer.parseInt(num2);
        Integer result = num3 + num4;
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("result", result);
        return "exam02-result";
    }

    @GetMapping("/toPage2")
    public String toPage2(){
        return "exam02-result2";
    }
}
