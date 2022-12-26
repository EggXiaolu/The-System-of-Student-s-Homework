package com.studentHomework.service;

import com.studentHomework.bean.User;

import java.util.ArrayList;

public interface FileService {
    ArrayList<User> getAllstudents();

    User getFileByNameOrId(String v);
}
