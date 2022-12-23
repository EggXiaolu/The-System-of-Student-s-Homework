package com.studentHomework.util;

import com.studentHomework.bean.User;
import com.studentHomework.dao.logindao;
import com.studentHomework.dao.logindaoImpl;

public class test {
    public static void main(String[] args) {

        logindao l = new logindaoImpl();
        User user = new User();
        user.setU_id("21211835111");
        user.setU_pwd("1");
        user=l.logindao(user);
        System.out.println(user.toString());
    }

}
