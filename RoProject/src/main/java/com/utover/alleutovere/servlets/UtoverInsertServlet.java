package com.utover.alleutovere.servlets;

import com.utover.alleutovere.alleUtovere;
import com.utover.alleutovere.objekter.utoveri;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet( name = "UtoverInsertServlet", urlPatterns = {"/LeggTil"})
public class UtoverInsertServlet extends HttpServlet {
    private Connection connection;
    private alleUtovere alleutovere;

    public void init(){
        alleutovere = new alleUtovere();
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int  Utøverid = Integer.parseInt(request.getParameter("uID"));
        int Kjonnid = Integer.parseInt(request.getParameter("kjonnID"));
        int Klubbid = Integer.parseInt(request.getParameter("klubbID"));
        int Klasseid = Integer.parseInt(request.getParameter("klasseID"));
        String Fornavn = request.getParameter("fornavn");
        String Etternavn = request.getParameter("etternavn");
        int Fodt = Integer.parseInt(request.getParameter("fodt"));
        utoveri nyUtover = new utoveri(Utøverid, Kjonnid, Klubbid, Klasseid, Fornavn, Etternavn, Fodt);
        alleutovere.insertUtover(nyUtover);




}
}
