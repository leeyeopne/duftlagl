package com.yedam.app.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.app.service.EmpVO;


@Controller
public class ThymeleafController {
    @GetMapping("thymeleaf")
    public String thymeleafTest(EmpVO empVO,Model model) {
        model.addAttribute("emp",empVO);
        return "test/main";
        //return "classpath:templates/test/main.html";
    }
}