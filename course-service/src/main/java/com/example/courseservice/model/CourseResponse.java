package com.example.courseservice.model;

import java.util.List;

public class CourseResponse {
    List<Course> courses;
    String timestamp;

    public CourseResponse() {

    }

    public CourseResponse(List<Course> courses, String timestamp) {
        this.courses = courses;
        this.timestamp = timestamp;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
