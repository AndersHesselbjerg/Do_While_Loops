package com.example.demo;

import com.example.demo.Service.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello world!";

    }

    @GetMapping("/tal")
    @ResponseBody
    public int skrivTal() {
        return 100;

    }

    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam String navn) {
        return navn;


    }


    @GetMapping("/product")
    @ResponseBody
    public int echo(@RequestParam int tal) {
        Calculator lr = new Calculator();
        return lr.product(tal);


    }

}