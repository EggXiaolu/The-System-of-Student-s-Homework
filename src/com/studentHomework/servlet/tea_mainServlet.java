package com.studentHomework.servlet;

import com.studentHomework.bean.User;
import com.studentHomework.service.FileService;
import com.studentHomework.service.FileServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/tea_mainServlet")
public class tea_mainServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String v = req.getParameter("v");
        String teacher_id = req.getParameter("id");
        FileService fs = new FileServiceImpl();
        ArrayList<User> u = fs.getFileByNameOrId(v);
        ArrayList<User> teacher = fs.getFileByNameOrId(teacher_id);
        if(u.isEmpty()){
            ArrayList<User> arr = fs.getAllstudents();
            req.setAttribute("arr",arr);
        }
        else{
            req.setAttribute("arr",u);
        }
        req.setAttribute("user",teacher.stream().findFirst().orElse(null));

        req.getRequestDispatcher("tea_mainPage.jsp").forward(req,resp);
    }
}
