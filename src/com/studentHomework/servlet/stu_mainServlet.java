package com.studentHomework.servlet;

import com.studentHomework.bean.Course;
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

@WebServlet("/stu_mainServlet")
public class stu_mainServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String v = req.getParameter("v");
        String student_id = req.getParameter("id");
        FileService fs = new FileServiceImpl();
        ArrayList<Course> u = fs.getCourseByNameOrId(v);
        ArrayList<User> student = fs.getFileByNameOrId(student_id);
        if(u.isEmpty()){
            ArrayList<Course> arr = fs.getAllcourses();
            req.setAttribute("arr",arr);
        }
        else{
            req.setAttribute("arr",u);
        }
        req.setAttribute("user",student.stream().findFirst().orElse(null));

        req.getRequestDispatcher("stu_mainPage.jsp").forward(req,resp);
    }
}
