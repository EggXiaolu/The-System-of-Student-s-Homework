package com.studentHomework.dao;

import com.studentHomework.bean.Course;
import com.studentHomework.bean.User;

import java.util.ArrayList;

public interface Filedao {
    ArrayList<User> getAllStudent();

    ArrayList<Course> getAllcourses();

    ArrayList<User> getFileByNameOrId(String v);

    ArrayList<Course> getCourseByNameOrId(String v);
}
