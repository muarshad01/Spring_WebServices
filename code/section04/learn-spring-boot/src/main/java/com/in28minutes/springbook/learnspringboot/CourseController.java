package com.in28minutes.springbook.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "AES", "Ali"),
                new Course(2, "DevOps", "Usman"),
                new Course(3, "Azure", "Umer"),
                new Course(4, "Go", "Patrick")
                );
    }
}
