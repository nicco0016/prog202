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
import java.util.List;

@WebServlet(name = "UtoverresultatServlet", urlPatterns = {"/testresultater", "/seresultater"})
public class UtoverresultatServlet extends HttpServlet {
    private int uid;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int utoverID = Integer.parseInt(request.getParameter("id"));
        uid = utoverID;

        String action = request.getServletPath();
        try{
            switch (action){
                case "/testresultater":
                    listOppResultater(request, response);
                    break;
                case "/seresultater":
                    listUtoverResultater(request, response);
                    break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listUtoverResultater(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        testresultat testres = new testresultat(uid);
        alleTestresultater alletestresultater = new alleTestresultater();
        List<testresultat> listtestresultat = alletestresultater.listOppEnUtover(testres);
        request.setAttribute("listtestresultat", listtestresultat);
        RequestDispatcher dispatcher = request.getRequestDispatcher("HentUtTestresultaterUtover.jsp");
        dispatcher.forward(request, response);
    }

    public void listOppResultater(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        testresultat testres = new testresultat(uid);
        alleTestresultater alletestresultater = new alleTestresultater();
        List<testresultat> listtestresultat = alletestresultater.listOppEnUtover(testres);
        request.setAttribute("listtestresultat", listtestresultat);
        RequestDispatcher dispatcher = request.getRequestDispatcher("HentUtTestresultaterUtover.jsp");
        dispatcher.forward(request, response);
    }
}
