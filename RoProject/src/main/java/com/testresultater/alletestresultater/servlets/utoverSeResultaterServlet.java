package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
import com.testresultater.alletestresultater.objekter.testresultat;
import com.utover.alleutovere.objekter.Utover;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
Denne servleten lar utøveren se egne testresulater eller én annen utøver sine resultater.
 */
@WebServlet(name = "UtoverresultatServlet", urlPatterns = {"/seEgneResultater", "/seEnAnnenSideResultater"})
public class utoverSeResultaterServlet extends HttpServlet {
    private int uid;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int utoverID = Integer.parseInt(request.getParameter("id"));
        uid = utoverID;

        String action = request.getServletPath();
        try{
            switch (action){
                case "/seEgneResultater":
                    mineTestresultater(request, response);
                    break;
                case "/seEnAnnenSideResultater":
                    seAnnenUtover(request, response);
                    break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    Denne metoden kjøres når en utøver ønsker å se "Mine testresultater", hvor alle de registrerte testresultatene
    vises i en tabell.
     */
        private void mineTestresultater(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            testresultat testres = new testresultat(uid);
            alleTestresultater alletestresultater = new alleTestresultater();
            List<testresultat> listtestresultat = alletestresultater.listOppEnUtover(testres);
            List<testresultat> listSeniorResultat = new ArrayList<>();
            List<testresultat> listJuniorAResultat = new ArrayList<>();
            List<testresultat> listJuniorBResultat = new ArrayList<>();
            List<testresultat> listJuniorCResultat = new ArrayList<>();
            for (testresultat testresultat: listtestresultat) {
                if (testresultat.getKlasseID().contains("Senior")) {
                    listSeniorResultat.add(testresultat);
                }
                else if (testresultat.getKlasseID().contains("Junior A")) {
                    listJuniorAResultat.add(testresultat);
                }
                else if (testresultat.getKlasseID().contains("Junior B")) {
                    listJuniorBResultat.add(testresultat);
                }
                else if (testresultat.getKlasseID().contains("Junior C")) {
                    listJuniorCResultat.add(testresultat);
                }
            }
            request.setAttribute("listSeniorResultat", listSeniorResultat);
            request.setAttribute("listJuniorAResultat", listJuniorAResultat);
            request.setAttribute("listJuniorBResultat", listJuniorBResultat);
            request.setAttribute("listJuniorCResultat", listJuniorCResultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("utover_mineTestresultater.jsp");
            dispatcher.forward(request, response);
        }
    /*
    Denne metoden kjøres når en utøver ønsker å gå inn og se på tesultatene til den enkelte utøver som er med i samme
    roklubb.
     */
    public void seAnnenUtover(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        testresultat testres = new testresultat(uid);
        alleTestresultater alletestresultater = new alleTestresultater();
        List<testresultat> listtestresultat = alletestresultater.listOppEnUtover(testres);
        List<testresultat> listSeniorResultat = new ArrayList<>();
        List<testresultat> listJuniorAResultat = new ArrayList<>();
        List<testresultat> listJuniorBResultat = new ArrayList<>();
        List<testresultat> listJuniorCResultat = new ArrayList<>();
        for (testresultat testresultat: listtestresultat) {
            if (testresultat.getKlasseID().contains("Senior")) {
                listSeniorResultat.add(testresultat);
            }
            else if (testresultat.getKlasseID().contains("Junior A")) {
                listJuniorAResultat.add(testresultat);
            }
            else if (testresultat.getKlasseID().contains("Junior B")) {
                listJuniorBResultat.add(testresultat);
            }
            else if (testresultat.getKlasseID().contains("Junior C")) {
                listJuniorCResultat.add(testresultat);
            }
        }
        request.setAttribute("listSeniorResultat", listSeniorResultat);
        request.setAttribute("listJuniorAResultat", listJuniorAResultat);
        request.setAttribute("listJuniorBResultat", listJuniorBResultat);
        request.setAttribute("listJuniorCResultat", listJuniorCResultat);
        RequestDispatcher dispatcher = request.getRequestDispatcher("utover_seEnAnnenTestresultater.jsp");
        dispatcher.forward(request, response);
    }
}
