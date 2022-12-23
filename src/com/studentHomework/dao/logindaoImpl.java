package com.studentHomework.dao;

import com.studentHomework.bean.User;

import java.sql.*;

public class logindaoImpl implements logindao{

    @Override
    public User logindao(User u) {
        //连接数据库
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
                //String sql = "SELECT * FROM `homework_database`.`users` WHERE `u_id` LIKE "+ u.getU_id()+" AND `u_pwd` LIKE "+ u.getU_pwd();
                String sql = "SELECT * FROM `homework_database`.`users` WHERE u_id LIKE 21211835111 AND u_pwd LIKE 1";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    User user = new User();
                    user.setU_id(rs.getString("u_id"));
                    user.setU_name(rs.getString("u_name"));
                    user.setU_pwd(rs.getString("u_pwd"));
                    user.setU_phone(rs.getString("u_phone"));
                    user.setU_role(rs.getInt("u_role"));
                    user.setU_isdelete(rs.getInt("u_isdelete"));
                    return user;
                }
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("数据库连接驱动没有安装");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
        return null;
    }
}
