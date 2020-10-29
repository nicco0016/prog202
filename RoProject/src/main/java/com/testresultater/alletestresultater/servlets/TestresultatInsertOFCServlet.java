package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
import com.testresultater.alletestresultater.objekter.testresultat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestresultatInsertOFCServlet", urlPatterns = {"/godkjent"})
public class TestresultatInsertOFCServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getServletPath();

        switch (action) {
            case "/godkjent":
                godkjenn(request, response);
                break;
        }
    }

    public void godkjenn(HttpServletRequest request, HttpServletResponse response){
        alleTestresultater alletestresultater = new alleTestresultater();
        int utoverID = Integer.parseInt(request.getParameter("id"));
        testresultat testresinsert = new testresultat(utoverID);
        alletestresultater.insertTestresultat_ofc(testresinsert);
        testresultat testresdelete = new testresultat(utoverID);
        alletestresultater.deleteTestresultat_mid(testresdelete);

    }
}



