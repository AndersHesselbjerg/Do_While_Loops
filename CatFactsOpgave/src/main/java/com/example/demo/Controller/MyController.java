package com.example.demo.Controller;

import com.example.demo.Models.CatFact;
import com.example.demo.Services.CatServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class MyController {
    private CatServices catServices = new CatServices();


}

@ResponseBody
public String getSingle() throws IOException{
    CatFact catFact;
    catFact = catServices.getCatFact();
    return catFact.toString();


    @GetMapping("/getten")
    @ResponseBody
    public String getTen () throws


}
