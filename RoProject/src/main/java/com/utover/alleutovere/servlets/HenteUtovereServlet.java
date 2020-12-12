package com.utover.alleutovere.servlets;

import com.utover.alleutovere.alleUtovere;
import com.utover.alleutovere.objekter.Utover;

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

@WebServlet(name = "v2utoverServlet", urlPatterns = {"/v2utoverServlet", "/alleUtovereIKlubben", "/hentUtover1", "/klubbUtovere" })
public class HenteUtovereServlet extends HttpServlet {

    private String roklubb;




    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {





        String klubb = request.getParameter("roklubb");
        roklubb = klubb;

        String action = request.getServletPath();

        try {
            switch (action) {
                case "/alleUtovereIKlubben":
                    utover_Listalleutovere(request, response);
                    break;
                case "/klubbUtovere":
                    trener_Listalleutovere(request, response);
                    break;


            }
        } catch (SQLException e) {
            throw new ServletException();
        }
    }




    private void utover_Listalleutovere(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        Utover utover = new Utover(roklubb);
        alleUtovere alleutovere = new alleUtovere();
        List<Utover> listUtover = alleutovere.listOppAlleUtovere(utover);
        request.setAttribute("listUtovere", listUtover);
        RequestDispatcher dispatcher = request.getRequestDispatcher("utover_utovere_i_klubben.jsp");
        dispatcher.forward(request, response);

    }

    private void trener_Listalleutovere(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        Utover utover = new Utover(roklubb);
        alleUtovere alleutovere = new alleUtovere();
        List<Utover> listUtover = alleutovere.listOppAlleUtovere(utover);
        request.setAttribute("listUtovere", listUtover);
        RequestDispatcher dispatcher = request.getRequestDispatcher("trener_MineUtovereTrener.jsp");
        dispatcher.forward(request, response);

    }


}
