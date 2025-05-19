package com.example.ex_beginner;

import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {

    @GetMapping("")
    public String index(Model model, UserForm userForm){
        return "exam04";
    }

    @PostMapping("/result")
    public String result(
            @Validated UserForm userForm,
            BindingResult result,
            RedirectAttributes redirectAttributes,
            Model model
    ) {
        if (result.hasErrors()) {
            return index(model, userForm);
        }

        User user = new User();
        BeanUtils.copyProperties(userForm, user);

        redirectAttributes.addFlashAttribute("user", user);

        return "redirect:/exam04/toResult";
    }

    @GetMapping("/toResult")
    public String toResult(){
        return "exam04-result";
    }
}

