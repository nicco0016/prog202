package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
import com.testresultater.alletestresultater.objekter.Testresultati;
import com.testresultater.alletestresultater.objekter.testresultat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "SammenlignServlet", urlPatterns = {"/sammenlign2utovere", "/sammenligbeste"})
public class SammenlignServlet extends HttpServlet {
    private int uid;
    private int uid2;
    private int Klasse;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int Uid = 0;
        Cookie cookies[] = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("UID"))
                Uid = Integer.parseInt(c.getValue());
            uid = Uid;
        }
        int klasse = 0;
        Cookie coookies[] = request.getCookies();
        for (Cookie c : coookies) {
            if (c.getName().equals("ROKLASSE"))
                klasse = Integer.parseInt(c.getValue());
            Klasse = klasse;
        }


        String action = request.getServletPath();
        try {
            switch (action) {
                case "/sammenlign2utovere":
                    sammenlign2utovere(request, response);
                    break;
                case "/sammenligbeste":
                    sammenligbeste(request, response);
                    break;

            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

    }

    private void sammenligbeste(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        testresultat testres1 = new testresultat(uid);
        Testresultati testres2 = new Testresultati(Klasse);
        alleTestresultater alletestres = new alleTestresultater();
        List<testresultat> listsammenlign1 = alletestres.sammenlignutover(testres1);
        List<Testresultati> listsammenlign2 = alletestres.sammenlignbeste(testres2);
        request.setAttribute("listsammenlign1", listsammenlign1);
        request.setAttribute("listsammenlign2", listsammenlign2);
        RequestDispatcher dispatcher = request.getRequestDispatcher("sammenlignbeste.jsp");
        dispatcher.forward(request, response);
    }

    private void sammenlign2utovere (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {
            int Uid2 = Integer.parseInt(request.getParameter("id2"));
            uid2 = Uid2;
            testresultat testres1 = new testresultat(uid);
            testresultat testres2 = new testresultat(uid2);
            alleTestresultater alletestres = new alleTestresultater();
            List<testresultat> listsammenlig1 = alletestres.sammenlignutover(testres1);
            List<testresultat> listsammenlig2 = alletestres.sammenlignutover(testres2);
            request.setAttribute("listsammenlig1", listsammenlig1);
            request.setAttribute("listsammenlig2", listsammenlig2);
            RequestDispatcher dispatcher = request.getRequestDispatcher("sammenlign2utovere.jsp");
            dispatcher.forward(request, response);
        }
    }

