package com.studentHomework.util;

import com.studentHomework.bean.Course;
import com.studentHomework.bean.User;
import com.studentHomework.service.FileService;
import com.studentHomework.service.FileServiceImpl;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws Exception {
        FileService fl = new FileServiceImpl();
        ArrayList<Course> arr = fl.getAllcourses();
        arr.stream().findFirst().orElse(null).toString();
    }

}
