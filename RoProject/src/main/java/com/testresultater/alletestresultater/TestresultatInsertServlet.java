package com.testresultater.alletestresultater;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestresultatInsertServlet", urlPatterns = {"/LeggTilTestresultat"})
public class TestresultatInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int utoverID = Integer.parseInt(request.getParameter("uID"));
        int år = Integer.parseInt(request.getParameter("år"));
        int uke = Integer.parseInt(request.getParameter("uke"));
        int klasseID = Integer.parseInt(request.getParameter("klasseID"));
        float watt_60 = Float.parseFloat(request.getParameter("watt_60"));
        int bevegelighet = Integer.parseInt(request.getParameter("Bevegelighet"));
        float watt_5000_m = Float.parseFloat(request.getParameter("watt_5000_m"));
        String  tid_5000_m = request.getParameter("tid_5000_m");
        float watt_2000_m = Float.parseFloat(request.getParameter("watt_2000_m"));
        String tid_2000_m = request.getParameter("tid_2000_m");
        float prosent_ligg_ro = Integer.parseInt(request.getParameter("prosent_ligg_ro"));
        int kilo_ligg_ro = Integer.parseInt(request.getParameter("kilo_ligg_ro"));
        int prosent_knebøy = Integer.parseInt(request.getParameter("prosent_knebøy"));
        int kilo_knebøy = Integer.parseInt(request.getParameter("kilo_knebøy"));
        int Cm_Sargeant = Integer.parseInt(request.getParameter("Cm_Sargeant"));
        int sek_3000_m = Integer.parseInt(request.getParameter("sek_3000_m"));
        int min_3000_m = Integer.parseInt(request.getParameter("min_3000_m"));
        int antall_Kr_hev = Integer.parseInt(request.getParameter("antall_Kr_hev"));
        int _3000_løp = Integer.parseInt(request.getParameter("_3000_løp"));
        int score = Integer.parseInt(request.getParameter("score"));


    }

}
