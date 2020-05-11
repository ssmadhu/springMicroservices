package com.example.userservice.model;

import java.util.Arrays;
import java.util.List;

public class User1 {

    String id;
    String name;
    String preferance;
    List<Course> courses;

    public User1() {

    }

    public User1(String id, String name, String preferance) {
        this.id = id;
        this.name = name;
        this.preferance = preferance;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<User1> init() {
        return Arrays.asList(
                new User1("1", "Madhumitha", "Java"),
                new User1("2", "Akshay", "Spring")
        );
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferance() {
        return preferance;
    }

    public void setPreferance(String preferance) {
        this.preferance = preferance;
    }

}
