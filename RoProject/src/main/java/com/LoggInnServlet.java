package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "LoggInnServlet", urlPatterns = {"/login"})
public class LoggInnServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String brukernavn = request.getParameter("brukernavn");
        int passord = Integer.parseInt(request.getParameter("passord"));
        if(brukernavn.contains("utover")){
            Cookie coockie = new Cookie("UID", passord + "");
            response.addCookie(coockie);
            response.sendRedirect("hentEn");;
        }
    }


}
