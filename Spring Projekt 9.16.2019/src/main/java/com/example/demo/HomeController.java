package com.example.demo;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@Controller
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final String INDEX = "index";

    @Autowired
    UserServiceimpl userService;

    @GetMapping("/")
    public String index(Model model) {
        List<Student>students = userService.fetchAllUsers();
        model.addAttribute("students", students);
        return "index";


    }

    @GetMapping("/anders")
    public String anders(Model model) {
        Student anders = userService.findById(0);
        model.addAttribute(s"anders", anders);
        return "anders";


    }


}
