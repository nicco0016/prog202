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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
Denne servleten henter ut alle testresultatene som er sendt inn som midlertidig, hvor super vil hente ut
og godkjenne/ikke godkjenne. Denne servleten henter ut den roklassen som hr blitt valgt på forhånd
av en innlogget super-bruker.
 */


@WebServlet(name = "alleTestresultaterMidServlet", urlPatterns = {"/testresmid"})
public class alleTestresultaterMidServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String klasseid = request.getParameter("klasse");

        List<testresultat> testresparam = new ArrayList<>();
        testresparam.add(new testresultat(klasseid));


        List<testresultat> listTestresultat = null;
        try {

            resultatverifisering verifisering = new resultatverifisering();
            listTestresultat = verifisering.listOppAlleTestresultater_mid(testresparam);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (klasseid.contains("Senior")) {
            request.setAttribute("listTestresultater", listTestresultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ResultSeniormid.jsp");
            dispatcher.forward(request, response);
        } else if (klasseid.contains("Junior A")) {
            request.setAttribute("listTestresultater", listTestresultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ResultJuniorAmid.jsp");
            dispatcher.forward(request, response);
        } else if (klasseid.contains("Junior B")) {
            request.setAttribute("listTestresultater", listTestresultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ResultJuniorBmid.jsp");
            dispatcher.forward(request, response);
        } else if (klasseid.contains("Junior C")) {
            request.setAttribute("listTestresultater", listTestresultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ResultJuniorCmid.jsp");
            dispatcher.forward(request, response);
        } else {
            System.out.print(" ");
        }
    }
}

