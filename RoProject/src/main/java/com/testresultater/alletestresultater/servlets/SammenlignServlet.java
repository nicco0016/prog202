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
/*
Denne servleten håndterer all funksjonalitet som har med ulike typer sammenligninger.
Metodene under hånterer sammenligning mellom 2 utøvere eller at en utøver sammenligner seg selv med de 10 beste
historisk nasjonalt i sin klasse.
 */
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
/*
Denne metoden henter og lager én tabell om utøveren selv og én større tabell med de 10 beste nasjonalt i denne klassen.
 */
    private void sammenligbeste(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        Testresultati testres1 = new Testresultati(uid, Klasse);
        Testresultati testres2 = new Testresultati(Klasse);
        alleTestresultater alletestres = new alleTestresultater();
        List<testresultat> listsammenlign1 = alletestres.sammenlignUtoverMotKlasse(testres1);
        List<Testresultati> listsammenlign2 = alletestres.sammenlignbeste(testres2);
        if (Klasse < 3){
            request.setAttribute("listsammenlign1", listsammenlign1);
            request.setAttribute("listsammenlign2", listsammenlign2);
            RequestDispatcher dispatcher = request.getRequestDispatcher("sammenlignBesteSenior.jsp");
            dispatcher.forward(request, response);
        }else if(Klasse >2 && Klasse < 5) {
            request.setAttribute("listsammenlign1", listsammenlign1);
            request.setAttribute("listsammenlign2", listsammenlign2);
            RequestDispatcher dispatcher = request.getRequestDispatcher("sammenlignBesteJuniorA.jsp");
            dispatcher.forward(request, response);
        }else if(Klasse >4 && Klasse < 7) {
            request.setAttribute("listsammenlign1", listsammenlign1);
            request.setAttribute("listsammenlign2", listsammenlign2);
            RequestDispatcher dispatcher = request.getRequestDispatcher("sammenlignBesteJuniorB.jsp");
            dispatcher.forward(request, response);
        }else if(Klasse >6 && Klasse < 9) {
            request.setAttribute("listsammenlign1", listsammenlign1);
            request.setAttribute("listsammenlign2", listsammenlign2);
            RequestDispatcher dispatcher = request.getRequestDispatcher("sammenlignBesteJuniorC.jsp");
            dispatcher.forward(request, response);
        }


    }
/*
Denne metoden sammenligner to utøvere opp mot hverandre. Først henter den ut alle testresultatene fra en innloggede
utøveren også henter den ut alle testresultater fra den utøveren man ønsker å sammenligne seg med.
 */
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

