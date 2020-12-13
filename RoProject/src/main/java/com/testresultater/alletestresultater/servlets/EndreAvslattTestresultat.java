package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
import com.testresultater.alletestresultater.objekter.Testresultati;
import com.testresultater.alletestresultater.objekter.testresultat;
import com.testresultater.alletestresultater.resultatverifisering;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/*
Hensikten med denne servleten er å utføre endringer i ikke-godkjente testresultater. Dette vil de 2 metodene
nedenfor utføre.

 */

@WebServlet(name = "EndreAvslattTestresultatServlet", urlPatterns = {"/endreTestresultat", "/oppdaterTestresultat"})
public class EndreAvslattTestresultat extends HttpServlet {
    private int Uid;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getServletPath();

        switch (action) {
            case "/endreTestresultat": //Step 1
                endreTestresultat(request, response);
                break;
            case "/oppdaterTestresultat": //Step 2
                oppdatertTestresultat(request, response);
                break;
        }
    }

    /*
    Hvis testresultatet blir "ikke-godkjent" ,så vil den havne hos rotreneren. Der kan han trykke på
    endre testresultat. Når treneren trykker på "endre" vil step 1 kjøres og
    treneres sender til siden for å endre resultatet.
     */
    public void endreTestresultat (HttpServletRequest request, HttpServletResponse response) throws IOException {
           int uid = Integer.parseInt(request.getParameter("id"));
           Uid = uid;
            response.sendRedirect("endre.jsp");
        }

    /*
    Deretter fyller treneren inn resultatet på nytt og sender dette inn. Det er her step 2 kjøres, hvor resultatet blir
    sendt inn på nytt for godkjenning.
     */
    private void oppdatertTestresultat(HttpServletRequest request, HttpServletResponse response) {

        int utoverID = Uid;
        float watt_60 = Float.parseFloat(request.getParameter("watt_60"));
        int bevegelighet = Integer.parseInt(request.getParameter("Bevegelighet"));
        float watt_5000_m = Float.parseFloat(request.getParameter("watt_5000_m"));
        String  tid_5000_m = request.getParameter("tid_5000_m");
        float watt_2000_m = Float.parseFloat(request.getParameter("watt_2000_m"));
        String tid_2000_m = request.getParameter("tid_2000_m");
        float prosent_ligg_ro = Float.parseFloat(request.getParameter("prosent_ligg_ro"));
        float kilo_ligg_ro = Float.parseFloat(request.getParameter("kilo_ligg_ro"));
        float prosent_knebøy = Float.parseFloat(request.getParameter("prosent_kneboy"));
        float kilo_knebøy = Float.parseFloat(request.getParameter("kilo_kneboy"));
        float cm_Sargeant = Float.parseFloat(request.getParameter("Cm_Sargeant"));
        String sek_3000_m = (request.getParameter("sek_3000_m"));
        String min_3000_m = request.getParameter("min_3000_m");
        int antall_Kr_hev = Integer.parseInt(request.getParameter("antall_Kr_hev"));
        String _3000_løp = request.getParameter("_3000_lop");
        float score = Float.parseFloat(request.getParameter("score"));
        resultatverifisering verifisering = new resultatverifisering();
        Testresultati param = new Testresultati(utoverID);
        param = verifisering.getarukeklasseid(param);
        int år = param.getÅr();
        int uke = param.getUke();
        int klasseID = param.getKlasseID();
        Testresultati nyttTestresultat2 = new Testresultati(utoverID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy, cm_Sargeant, sek_3000_m, min_3000_m, antall_Kr_hev, _3000_løp, score);
        verifisering.insertTestresultat_endret(nyttTestresultat2);
        testresultat testresdelete = new testresultat(utoverID);
        verifisering.deleteTestresultat_avsla(testresdelete);

    }

}
