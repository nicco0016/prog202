package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
import com.trener.Trener;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "getallUIDServlet", urlPatterns = {"/getuiddropdown"})
public class getallUIDServlet extends HttpServlet {
    private int klubbid;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int klubbID = 0;
        Cookie coookies[] = request.getCookies();
        for (Cookie c : coookies) {
            if (c.getName().equals("KLUBBID"))
                klubbID = Integer.parseInt(c.getValue());
            klubbid = klubbID;
        }


        String action = request.getServletPath();

        switch (action) {
            case "/getuiddropdown":
                try {
                    ListgetallUID(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

        }

    }

    private void ListgetallUID(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        Trener trener = new Trener(klubbid);
        alleTestresultater alletestres = new alleTestresultater();
        List<Trener>  idList = alletestres.getallUID(trener);
        request.setAttribute("uidliste", idList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("innrappSkjema.jsp");
        dispatcher.forward(request, response);
    }
}
