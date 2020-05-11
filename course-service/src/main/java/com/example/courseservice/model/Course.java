package com.example.courseservice.model;

import java.util.Arrays;
import java.util.List;


public class Course {
    String id;
    String name;
    String description;
    String category;

    public Course() {

    }

    public Course(String id, String name, String description, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public List<Course> init() {
        return Arrays.asList(
                new Course("1"," Java Basics", "Java Basics", "Java" ),
                new Course("2"," Java Functional Programming", "Java Basics", "Java" ),
                new Course("3"," Spring Basics", "Java Basics", "Spring" )
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
