package com.example.lab1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write( "<h1> hien </h1>" + "aaaaa");

//        req.setAttribute("an", "gia bao");
//        req.getRequestDispatcher("/index.jsp").forward(req,resp);

        String ten = req.getParameter("ten");
        resp.getWriter().println(ten);


    }
}