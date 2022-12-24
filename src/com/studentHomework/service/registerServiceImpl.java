package com.studentHomework.service;

import com.studentHomework.bean.User;
import com.studentHomework.dao.registerdao;
import com.studentHomework.dao.registerdaoImpl;

public class registerServiceImpl implements registerService{

    @Override
    public Boolean registerService(User u) {
        registerdao rd = new registerdaoImpl();
        return  rd.registerdao(u);
    }
}
