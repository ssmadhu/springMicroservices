package com.example.courseservice.controller;

import com.example.courseservice.model.Course;
import com.example.courseservice.model.CourseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CourseController {

    @Autowired
    Course course;
    @RequestMapping(method= RequestMethod.GET, value="/courses")
    public CourseResponse getCourses() {
        return new CourseResponse(course.init(), new Date().toString());
    }


}
