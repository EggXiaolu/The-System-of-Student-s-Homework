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

@WebServlet("/mainServlet")
public class mainServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String v = req.getParameter("v");
        String teacher_id = req.getParameter("id");
        System.out.println(v+teacher_id);
        FileService fs = new FileServiceImpl();
        User u = fs.getFileByNameOrId(v);
        User teacher = fs.getFileByNameOrId(teacher_id);
        ArrayList<User> arr = new ArrayList<>();
        u.toString();
        teacher.toString();
        if(u!=null){
            arr.add(u);
        }else{
            arr = fs.getAllstudents();
        }
        req.setAttribute("user",teacher);
        req.setAttribute("arr",arr);
        req.getRequestDispatcher("tea_mainPage.jsp").forward(req,resp);
    }
}
