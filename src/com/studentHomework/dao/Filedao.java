package com.studentHomework.dao;

import com.studentHomework.bean.User;

import java.util.ArrayList;

public interface Filedao {
    ArrayList<User> getAllStudent();

    ArrayList<User> getFileByNameOrId(String v);
}
