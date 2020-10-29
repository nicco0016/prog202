package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.objekter.Testresultati;
import com.testresultater.alletestresultater.alleTestresultater;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestresultatInsertServlet", urlPatterns = {"/LeggTilTestresultat"})
public class TestresultatInsertServlet extends HttpServlet {
    private alleTestresultater alletestresultater;

    public void init(){alletestresultater = new alleTestresultater();}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int utoverID = Integer.parseInt(request.getParameter("uID"));
        int år = Integer.parseInt(request.getParameter("ar"));
        int uke = Integer.parseInt(request.getParameter("uke"));
        int klasseID = Integer.parseInt(request.getParameter("klasseID"));
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
        float sek_3000_m = Float.parseFloat(request.getParameter("sek_3000_m"));
        String min_3000_m = request.getParameter("min_3000_m");
        int antall_Kr_hev = Integer.parseInt(request.getParameter("antall_Kr_hev"));
        String _3000_løp = request.getParameter("_3000_lop");
        float score = Float.parseFloat(request.getParameter("score"));
        Testresultati nyttTestresultat = new Testresultati(utoverID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy, cm_Sargeant, sek_3000_m, min_3000_m, antall_Kr_hev, _3000_løp, score);
        alletestresultater.insertTestresultat_mid(nyttTestresultat);

    }

}
