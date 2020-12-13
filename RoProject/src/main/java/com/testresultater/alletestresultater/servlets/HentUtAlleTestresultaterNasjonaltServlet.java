package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
import com.testresultater.alletestresultater.objekter.testresultat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
Denne servleten henter ut alle testresultater på nasjonalt nivå fra ett testbatteri og fra én klassen.
 */
@WebServlet(name = "alleTestresultaterServlet", urlPatterns = {"/parameter"})
public class HentUtAlleTestresultaterNasjonaltServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int år = Integer.parseInt(request.getParameter("år"));
        int uke = Integer.parseInt(request.getParameter("uke"));
        String klasseid = request.getParameter("klasse");


        List<testresultat> testresparam = new ArrayList<>();
        testresparam.add(new testresultat(år, uke, klasseid ));


        List<testresultat> listTestresultat = null;
        try {

            alleTestresultater alletestresultater = new alleTestresultater();
            listTestresultat = alletestresultater.listOppAlleTestresultater(testresparam);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(klasseid.contains("Senior")){
            request.setAttribute("listTestresultater", listTestresultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ResultSenior.jsp");
            dispatcher.forward(request, response);
        }
        else if(klasseid.contains("Junior A")){
            request.setAttribute("listTestresultater", listTestresultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ResultJuniorA.jsp");
            dispatcher.forward(request, response);
        }
        else if(klasseid.contains("Junior B")){
            request.setAttribute("listTestresultater", listTestresultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ResultJuniorB.jsp");
            dispatcher.forward(request, response);
        }
        else if(klasseid.contains("Junior C")){
            request.setAttribute("listTestresultater", listTestresultat);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ResultJuniorC.jsp");
            dispatcher.forward(request, response);
        }
        else{
        System.out.print(" ");
        }







        /*String action = request.getServletPath();

        try {
            switch (action) {
                case "/alleTestresultaterServlet":
                    Listalletestresultater(request, response);
                    break;
                case "/test1":
                    test1(request, response);
                    break;
                case "/herlig":
                    herligmetode(request, response);
                    break;
                case "/fantastisk":
                    fantastiskmetode(request, response);
                    break;

                default:
                    Listalletestresultater(request, response);
            }
        }catch (SQLException e){
            throw new ServletException();
        }

        /*try {
            Listalletestresultater(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/


    }


    public void test2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Test av case test1");
    }
    public void test1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Test av case test2 DET FUNKET <3");
    }
    public void herligmetode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out1 = response.getWriter();
        out1.println("Denne funket også");
    }

    public void fantastiskmetode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out2 = response.getWriter();
        out2.println("Fantastisk");
    }
}

