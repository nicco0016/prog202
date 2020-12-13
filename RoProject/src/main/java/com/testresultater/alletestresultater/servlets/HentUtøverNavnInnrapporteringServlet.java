package com.testresultater.alletestresultater.servlets;

import com.testresultater.alletestresultater.alleTestresultater;
import com.trener.Trener;
import com.utover.alleutovere.getUID;
import com.utover.alleutovere.objekter.Utover;
import com.utover.alleutovere.objekter.utoveri;

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

/*
Denne servleten henter ut alle utøverID, fornavn og etternavn fra utøvere i en bestemt klubb, ut ifra klubbID(fra cookie)

 */
@WebServlet(name = "getallUIDServlet", urlPatterns = {"/getuiddropdown"})
public class HentUtøverNavnInnrapporteringServlet extends HttpServlet {
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
        utoveri utover = new utoveri(klubbid);
        getUID getuid = new getUID();
        List<utoveri>  senior = getuid.getallUIDSenior(utover);
        List<utoveri>  jA = getuid.getallUIDJuniorA(utover);
        List<utoveri>  jB = getuid.getallUIDJuniorB(utover);
        List<utoveri>  jC = getuid.getallUIDJuniorC(utover);
        request.setAttribute("senior", senior);
        request.setAttribute("jA", jA);
        request.setAttribute("jB", jB);
        request.setAttribute("jC", jC);
        RequestDispatcher dispatcher = request.getRequestDispatcher("innrappSkjema.jsp");
        dispatcher.forward(request, response);
    }
}
