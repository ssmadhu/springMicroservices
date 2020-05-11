package com.example.userservice.controller;

import com.example.userservice.model.Course;
import com.example.userservice.model.CourseResponse;
import com.example.userservice.model.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    User1 user;

    @RequestMapping(method= RequestMethod.GET, value="users")
    public List<User1> getUsers() {
       RestTemplate restTemplate = new RestTemplate();
       CourseResponse response = restTemplate.getForObject("http://course-service/courses", CourseResponse.class);
       List<User1> users = user.init();
       users.forEach(x -> {
           List<Course> course = response.getCourses()
                   .stream()
                   .filter(y -> y.getCategory().equals(x.getPreferance()))
                   .collect(Collectors.toList());
           x.setCourses(course);
       });
       return users;
   }

}
