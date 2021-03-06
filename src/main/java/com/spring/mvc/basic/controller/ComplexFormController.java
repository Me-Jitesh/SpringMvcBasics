package com.spring.mvc.basic.controller;

import com.spring.mvc.basic.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComplexFormController {

    @RequestMapping("/complex")
    public String showForm() {

        return "complex_form";
    }

    @RequestMapping(path = "/processor", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute("studante") Student student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "complex_form";
        }
        System.out.println(student);
        return "complex_dashboard";
    }

}
