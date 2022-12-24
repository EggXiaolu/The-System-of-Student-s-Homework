package com.studentHomework.servlet;

import com.studentHomework.bean.User;
import com.studentHomework.service.registerService;
import com.studentHomework.service.registerServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/register")
public class registerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String u_id=req.getParameter("u_id"); //获取账号
        String u_pwd=req.getParameter("u_pwd"); //获取密码
        String u_name=req.getParameter("u_name"); //获取姓名
        String u_phone=req.getParameter("u_phone"); //获取电话
        int u_role = Integer.parseInt(req.getParameter("u_role"));
        User u = new User();
        u.setU_id(u_id);
        u.setU_pwd(u_pwd);
        u.setU_name(u_name);
        u.setU_phone(u_phone);
        u.setU_role(u_role);
        //实现登录服务层的业务逻辑层
        registerService r =new registerServiceImpl();
        Boolean ret = r.registerService(u);
        if(ret) {
            System.out.println("数据添加成功！");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
            req.setAttribute("success", true);
        }else {
            System.out.println("数据添加失败！");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            req.setAttribute("success", false);
        }
    }
}