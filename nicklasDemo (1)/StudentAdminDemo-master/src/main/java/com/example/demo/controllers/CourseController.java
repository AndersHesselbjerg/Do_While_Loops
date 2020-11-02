package com.example.demo.controllers;

import com.example.demo.models.Course;
import com.example.demo.models.Student;
import com.example.demo.repositories.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {

    private CourseRepository courseRepository;

    public CourseController() {
        courseRepository = new CourseRepository();
    } //hvorfor skal dette med?

    @GetMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("courselist", courseRepository.listCourses());
        return "student/courses";
    }


    @GetMapping("/createcourse")
    public String createCourse() {
        return "student/createCourse";

    }

    @PostMapping("/addcourse")
    public String addCourse(@ModelAttribute Course courseFromPost) {
        courseRepository.create(courseFromPost);
        return "student/createCourse";
    }

    @GetMapping("/updatecourse")
    public String updateCourse() {
        return "student/updatecourse";
    }

    @PostMapping("/updatedcourse")
    public String updatedcourse(@ModelAttribute Course courseFromPost) {
        courseRepository.update(courseFromPost);
        return "redirect:/courses";

    }

    @GetMapping("/deletecourse")
    public String deletecourseByParameter(@RequestParam int kursus_id, Model model){
        courseRepository.delete(kursus_id);
        return "redirect:/courses";

    }

    @GetMapping("/course")
    public String getCourseByParameter(@RequestParam int kursus_id, Model model) {
        Course crs = courseRepository.read(kursus_id);
        model.addAttribute("kurset", crs);
        return "student/singlecourse";

         /* return "The course name is: " + crs.getKursusNavn() +
                " and the start date is " + crs.getStartDato() +
                " and the etcs points is " + crs.getEtcs() +
                " and then course description is " + crs.getKursusBeskrivelse();

          */
    }
    }

