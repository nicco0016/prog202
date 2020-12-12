package com.testresultater.alletestresultater.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OppdaterListeServlet", urlPatterns = {"/adminGodkjenningsListe"})
public class OppdaterListeServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getServletPath();

        try {
            switch (action) {
                case "/adminGodkjenningsListe":
                    adminGodkjenningsListe(request, response);
                    break;


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void adminGodkjenningsListe(HttpServletRequest request, HttpServletResponse response) {

    }


}


