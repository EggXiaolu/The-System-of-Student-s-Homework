package com.studentHomework.service;

import com.studentHomework.bean.User;
import com.studentHomework.dao.logindao;
import com.studentHomework.dao.logindaoImpl;

public class loginServiceImpl implements loginService{
    @Override
    public User loginService(User u) {
        logindao ld = new logindaoImpl();
        return ld.logindao(u);
    }
}
