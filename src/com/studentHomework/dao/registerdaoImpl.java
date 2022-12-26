package com.studentHomework.dao;

import com.studentHomework.bean.User;

import java.sql.*;
import java.util.Objects;

public class registerdaoImpl implements registerdao{

    @Override
    public Boolean registerdao(User u) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";

        String root = "root";
        String password="root123";

        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,root,password);
            if(!con.isClosed()){
                System.out.println("数据库连接成功");
                Statement stmt = con.createStatement();
                //sql语句

                String sql = "INSERT INTO `homework_database`.`users`(u_id,u_pwd,u_phone,u_role,u_isdelete,u_name) values ('"+u.getU_id()+"','"+u.getU_pwd()+"','"+u.getU_phone()+"',"+ u.getU_role()+","+1+",'"+u.getU_name()+"')";
                stmt.executeUpdate(sql);
                return true;
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("数据库连接驱动加载失败");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("数据查找失败！");
        }
        return false;
    }
}
