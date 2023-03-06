package com.example.lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HcnServlet", value = "/HcnServlet")
public class HcnServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String x = request.getParameter("dai");
        String y = request.getParameter("rong");

        double dai = Double.parseDouble(x);
        double rong = Double.parseDouble(y);

        double dt = dai *rong;
        double cv = (dai+rong)*2;

        request.setAttribute("dt", dt );
        request.setAttribute("cv", cv );

        request.getRequestDispatcher("/ket_qua.jsp").forward(request, response);

//        response.getWriter().write("Diện tích là: " + dt);
//        response.getWriter().write("Chu vi là: " + cv);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
