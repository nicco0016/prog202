package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
import com.testresultater.alletestresultater.insertModel;
import com.testresultater.alletestresultater.objekter.Testresultati;
import com.utover.alleutovere.alleUtovere;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/*
Denne servleten hånterer innrapportering og sender testresultatene inn til midlertidig-tabellen for påvente av super sin
godkjenning.
 */
@WebServlet(name = "InsertServlet", urlPatterns = {"/insertSenior", "/insertJuniorA", "/insertJuniorB", "/insertJuniorC" })
public class InnrapporteringServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getServletPath();
        try {
            switch (action){
                case "/insertSenior":
                    insertSenior(request, response);
                    break;
                case "/insertJuniorA":
                    insertJuniorA(request, response);
                    break;
                case "/insertJuniorB":
                    insertJuniorB(request, response);
                    break;
                case "/insertJuniorC":
                    insertJuniorC(request, response);
                    break;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    private void insertSenior(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int år = Integer.parseInt(request.getParameter("ar"));
        int uke = Integer.parseInt(request.getParameter("uke"));
        int utoverID = Integer.parseInt(request.getParameter("utoverID"));
        float watt_60 = Float.parseFloat(request.getParameter("watt_60"));
        int bevegelighet = Integer.parseInt(request.getParameter("bevegelighet"));
        float watt_5000_m = Float.parseFloat(request.getParameter("watt_5000_m"));
        String min_5000 = request.getParameter("5000Min");
        String sek_5000 = request.getParameter("5000Sek");
        float watt_2000_m = Float.parseFloat(request.getParameter("watt_2000"));
        String min_2000 = request.getParameter("2000Min");
        String sek_2000 = request.getParameter("2000Sek");
        float prosent_ligg_ro = Float.parseFloat(request.getParameter("Liggro(%)"));
        float kilo_ligg_ro = Float.parseFloat(request.getParameter("Liggro(kg)"));
        float prosent_knebøy = Float.parseFloat(request.getParameter("Kneboy(%)"));
        float kilo_knebøy = Float.parseFloat(request.getParameter("Kneboy(kg)"));
        alleUtovere alleutovere = new alleUtovere();
        Testresultati param = new Testresultati(utoverID);
        param = alleutovere.getKlasseID(param);
        int klasseID = param.getKlasseID();
        insertModel insert = new insertModel();
        Testresultati nyttTestresultat = new Testresultati(år, uke, utoverID, klasseID, watt_60, bevegelighet, watt_5000_m, min_5000, sek_5000, watt_2000_m, min_2000, sek_2000, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy);
        insert.insertTestresultat_mid_senior(nyttTestresultat);
    }

    private void insertJuniorA(HttpServletRequest request, HttpServletResponse response) {
        int år = Integer.parseInt(request.getParameter("ar"));
        int uke = Integer.parseInt(request.getParameter("uke"));
        int utoverID = Integer.parseInt(request.getParameter("utoverID"));
        float watt_60 = Float.parseFloat(request.getParameter("watt_60"));
        int bevegelighet = Integer.parseInt(request.getParameter("bevegelighet"));
        float watt_5000_m = Float.parseFloat(request.getParameter("watt_5000_m"));
        String min_5000 = request.getParameter("5000Min");
        String sek_5000 = request.getParameter("5000Sek");
        float watt_2000_m = Float.parseFloat(request.getParameter("watt_2000"));
        String min_2000 = request.getParameter("2000Min");
        String sek_2000 = request.getParameter("2000Sek");
        float prosent_ligg_ro = Float.parseFloat(request.getParameter("Liggro(%)"));
        float kilo_ligg_ro = Float.parseFloat(request.getParameter("Liggro(kg)"));
        float sargeant = Float.parseFloat(request.getParameter("Sargeant"));
        alleUtovere alleutovere = new alleUtovere();
        Testresultati param = new Testresultati(utoverID);
        param = alleutovere.getKlasseID(param);
        int klasseID = param.getKlasseID();
        insertModel insert = new insertModel();
        Testresultati nyttTestresultat = new Testresultati(utoverID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, min_5000, sek_5000, watt_2000_m, min_2000, sek_2000, prosent_ligg_ro, kilo_ligg_ro, sargeant);
        insert.insertTestresultat_mid_jA(nyttTestresultat);
    }

    private void insertJuniorB(HttpServletRequest request, HttpServletResponse response) {
        int år = Integer.parseInt(request.getParameter("ar"));
        int uke = Integer.parseInt(request.getParameter("uke"));
        int utoverID = Integer.parseInt(request.getParameter("utoverID"));
        float watt_60 = Float.parseFloat(request.getParameter("watt_60"));
        int bevegelighet = Integer.parseInt(request.getParameter("bevegelighet"));
        int totalSek_3000_m = Integer.parseInt(request.getParameter("sek_3000"));
        String min_3000_m = request.getParameter("3000Min");
        String sek_3000_m = (request.getParameter("3000Sek"));
        float watt_2000_m = Float.parseFloat(request.getParameter("watt_2000"));
        String min_2000 = request.getParameter("2000Min");
        String sek_2000 = request.getParameter("2000Sek");
        int antall_Kr_hev = Integer.parseInt(request.getParameter("kroppshev"));
        float sargeant = Float.parseFloat(request.getParameter("Sargeant"));
        alleUtovere alleutovere = new alleUtovere();
        Testresultati param = new Testresultati(utoverID);
        param = alleutovere.getKlasseID(param);
        int klasseID = param.getKlasseID();
        insertModel insert = new insertModel();
        Testresultati nyttTestresultat = new Testresultati(utoverID, år, uke, klasseID, watt_60, bevegelighet, watt_2000_m, totalSek_3000_m, sek_3000_m, min_3000_m,  min_2000, sek_2000, antall_Kr_hev, sargeant);
        insert.insertTestresultat_mid_jB(nyttTestresultat);
    }


    private void insertJuniorC(HttpServletRequest request, HttpServletResponse response) {
        int år = Integer.parseInt(request.getParameter("ar"));
        int uke = Integer.parseInt(request.getParameter("uke"));
        int utoverID = Integer.parseInt(request.getParameter("utoverID"));
        float watt_60 = Float.parseFloat(request.getParameter("watt_60"));
        int bevegelighet = Integer.parseInt(request.getParameter("bevegelighet"));
        String _3000_løp_min = request.getParameter("3000lopMin");
        String _3000_løp_sek = request.getParameter("3000lopSek");
        String _3000_løp = _3000_løp_min + "." + _3000_løp_sek;
        int antall_Kr_hev = Integer.parseInt(request.getParameter("kroppshev"));
        float Cm_Sargeant = Float.parseFloat(request.getParameter("Sargeant"));
        alleUtovere alleutovere = new alleUtovere();
        Testresultati param = new Testresultati(utoverID);
        param = alleutovere.getKlasseID(param);
        int klasseID = param.getKlasseID();
        insertModel insert = new insertModel();
        Testresultati nyttTestresultat = new Testresultati(utoverID, år, uke, klasseID, watt_60, bevegelighet, Cm_Sargeant, antall_Kr_hev, _3000_løp);
        insert.insertTestresultat_mid_jC(nyttTestresultat);

    }




}
