package com.studentHomework.service;

import com.studentHomework.bean.Course;
import com.studentHomework.bean.User;

import java.util.ArrayList;

public interface FileService {
    ArrayList<User> getAllstudents();

    ArrayList<User> getFileByNameOrId(String v);

    ArrayList<Course> getAllcourses();
    ArrayList<Course> getCourseByNameOrId(String v);
}
