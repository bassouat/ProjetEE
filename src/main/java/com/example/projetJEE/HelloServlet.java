package com.example.projetJEE;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
@Slf4j
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Basseydou est un CRACK!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        log.info("moi");
    }

    public void destroy() {
    }
}