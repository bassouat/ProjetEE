package com.example.projetJEE;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PremiereServlet", value = "/PremiereServlet")
public class PremiereServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String name = request.getParameter("name");
//        PrintWriter writer = response.getWriter();
//        writer.println("Basseydou".concat(name));
//        writer.flush();
//        System.out.println(request.getParameter("name"));
        String name = request.getParameter("name");
        request.setAttribute("name",name);
        request.getRequestDispatcher("/WEB-INF/views/loginJSP.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
