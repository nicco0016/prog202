package com.klubb;

import com.testresultater.alletestresultater.alleTestresultater;
import com.testresultater.alletestresultater.objekter.testresultat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "VisAlleKlubberServlet", urlPatterns = {"/alleKlubber"})
public class VisAlleKlubberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        klubbsql klubb = new klubbsql();
        List<klubb> klubber = null;
        try {
            klubber = klubb.visAlleKLubber();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("klubber", klubber);
        RequestDispatcher dispatcher = request.getRequestDispatcher("klubbSide.jsp");
        dispatcher.forward(request, response);

    }
}
