package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
public class MyController {


    @GetMapping("/")
    public String welcome(@RequestParam(required = false) String name, Model model) {
        if (name == null) {
            name = "world";
        }

        {
            model.addAttribute("msg", "Hello!!!!" + name); // key(msg)-value (Hello)
            return "welcome";
        }
        @GetMapping("/calc")
        public String welcome(@RequestParam int num1, @RequestParam int num2, Model model)
        int num3 = num1 + num2;
        model.addAllAttributes("calc", num3);
        return "result"

        @PostMapping("/calc")
        public String calc(@RequestParam int)






    }
}