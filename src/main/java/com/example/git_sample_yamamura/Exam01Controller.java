package com.example.git_sample_yamamura;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

    @GetMapping("")
    public String index(){
        System.out.println("index()");
        return "exam01-result";
    }

    @PostMapping("/showName")
    public String showName(String name, Model model){
        model.addAttribute("name", name);
        return "exam01-result";
    }
}
