package com.testresultater.alletestresultater;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UtoverresultatServlet", urlPatterns = {"/testresultater"})
public class UtoverresultatServlet extends HttpServlet {
    private alleTestresultater alletestresultater;

    public void init(){ alletestresultater = new alleTestresultater();}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getServletPath();
        try{
            switch (action){
                case "/testresultater":
                    listOppResultater(request, response);
                    break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listOppResultater(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        List<testresultat> listtestresultat = alletestresultater.listOppEnUtover();
        request.setAttribute("listtestresultat", listtestresultat);
        RequestDispatcher dispatcher = request.getRequestDispatcher("HentUtTestresultaterUtover.jsp");
        dispatcher.forward(request, response);
    }
}
