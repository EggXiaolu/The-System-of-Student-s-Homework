package com.studentHomework.dao;

import com.studentHomework.bean.User;

public class logindaoImpl implements logindao{

    @Override
    public User logindao(User u) {
        //数据库
        String id = u.getU_id();
        String pwd = u.getU_pwd();
        return new User("21211835111","蛋蛋","1","1234567891",1,0);
    }
}
