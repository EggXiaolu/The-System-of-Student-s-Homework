package com.studentHomework.servlet;

import com.studentHomework.util.Sample;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/codeCheck")
public class codeCheckServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phone_str = req.getParameter("u_phone");
        System.out.println(phone_str);
        String code = null;
        try {
            code = Sample.main(phone_str);
        } catch (Exception e) {
            System.out.println("验证码获取失败!");
        }
        req.setAttribute("ret_code", code);
        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }
}
