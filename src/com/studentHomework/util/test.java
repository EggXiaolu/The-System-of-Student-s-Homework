package com.studentHomework.util;

import com.studentHomework.bean.User;
import com.studentHomework.dao.logindao;
import com.studentHomework.dao.logindaoImpl;
import com.studentHomework.service.loginService;
import com.studentHomework.service.loginServiceImpl;
import com.studentHomework.service.registerService;
import com.studentHomework.service.registerServiceImpl;

public class test {
    public static void main(String[] args) {
        User user = new User();
        user.setU_id("21211835112");
        user.setU_pwd("1");
        user.setU_phone("1");
        user.setU_name("张三");
        registerService r =new registerServiceImpl();
        Boolean ret =r.registerService(user);
        System.out.println(ret);
    }

}
