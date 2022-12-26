package com.studentHomework.service;

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
}
