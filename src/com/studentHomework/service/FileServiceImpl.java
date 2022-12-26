package com.studentHomework.service;

import com.studentHomework.bean.Course;
import com.studentHomework.bean.User;
import com.studentHomework.dao.Filedao;
import com.studentHomework.dao.FiledaoImpl;

import java.util.ArrayList;

public class FileServiceImpl implements FileService{
    Filedao fs = new FiledaoImpl();
    @Override
    public ArrayList<User> getAllstudents() {
        //访问持久层
        return fs.getAllStudent();
    }

    @Override
    public ArrayList<User> getFileByNameOrId(String v) {
        return fs.getFileByNameOrId(v);
    }

    @Override
    public ArrayList<Course> getAllcourses() {
        return fs.getAllcourses();
    }

    @Override
    public ArrayList<Course> getCourseByNameOrId(String v) {
        return fs.getCourseByNameOrId(v);
    }
}
