package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
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

/*
Hensikten med denne servleten er å håndtere godkjente og/eller ikke-godkejnte testresultater fra super-brukeren.
 */

@WebServlet(name = "TestresultatInsertOFCServlet", urlPatterns = {"/godkjent", "/ikkegodkjent"})
public class GodkjenningsServlet extends HttpServlet {
private String klasseID;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getServletPath();

        switch (action) {
            case "/godkjent":
                godkjenn(request, response);
                break;
            case "/ikkegodkjent":
                avsla(request, response);
                break;
        }
    }
    /*
    Denne metoden vil håndtere godkjente testresultater, ved at den henter fra midlertidig tabellen og inserter
    inn i den faktiske testresultattabellen. Etter dette vil resultatet bli fjernet fra den midlertidige tabellen.
    Etter alt dette er kjørt vil trener og roer kunne se resultatet sitt.
     */
    public void godkjenn(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        resultatverifisering verifisering = new resultatverifisering();
        int utoverID = Integer.parseInt(request.getParameter("id"));
        testresultat testresinsert = new testresultat(utoverID);
        verifisering.insertTestresultat_ofc(testresinsert);
        testresultat testresdelete = new testresultat(utoverID);
        verifisering.deleteTestresultat_mid(testresdelete);
    }
    /*
    Denne metoden vil håndtere ikke-godkejnte testresultater. De vil da bli sendt til trener hvor han/hun kan endre
    resultatet. Deretter vil dette resultatet bli fjernet fra midlertidig tabellen.
     */
    public void avsla(HttpServletRequest request, HttpServletResponse response){
        resultatverifisering verifisering = new resultatverifisering();
        int utoverID = Integer.parseInt(request.getParameter("id"));
        testresultat testresinsert = new testresultat(utoverID);
        verifisering.insertTestresultat_avsla(testresinsert);
        testresultat testresdelete = new testresultat(utoverID);
        verifisering.deleteTestresultat_mid(testresdelete);
    }
}



