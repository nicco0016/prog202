package com.testresultater.alletestresultater.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "TestresultatAvslaEndreServlet", urlPatterns = {"/endre", "/endreutover"})
public class TestresultatAvslaEndreServlet extends HttpServlet {
    private int uid;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int Uid = Integer.parseInt(request.getParameter("id"));
        uid = Uid;

        String action = request.getServletPath();

        switch (action) {
            case "/endre":
                endretestresultat(request, response);
                break;
            case "/endreutover":
                endreutover(request, response);
                break;
        }
    }

    private void endretestresultat(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie = new Cookie("UID", uid + "");
        response.addCookie(cookie);
        response.sendRedirect("endre.jsp");
    }

    private void endreutover(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie = new Cookie("UID", uid + "");
        response.addCookie(cookie);
        response.sendRedirect("endreutover.jsp");
    }
}
