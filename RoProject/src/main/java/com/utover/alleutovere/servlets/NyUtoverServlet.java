package com.utover.alleutovere.servlets;

import com.utover.alleutovere.alleUtovere;
import com.utover.alleutovere.objekter.utoveri;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet( name = "UtoverInsertServlet", urlPatterns = {"/LeggTil"})
public class NyUtoverServlet extends HttpServlet {
    private Connection connection;
    private alleUtovere alleutovere;
    private int klubbID;
    private int Kjonn;
    private  int Klasse;

    public void init() {
        alleutovere = new alleUtovere();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int klubbid = 0;
        Cookie cookies[] = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("KLUBBID"))
                klubbid = Integer.parseInt(c.getValue());
            klubbID = klubbid;
        }


            String kjonn = request.getParameter("kjonn");
            if (kjonn.contains("Mann")){
                Kjonn = 1;
            }
            else if (kjonn.contains("Kvinne")){
                Kjonn = 2;
            }
            String klasse = request.getParameter("klasse");
            if (klasse.contains("Senior menn")){
                Klasse = 1;
            }
            else if (klasse.contains("Senior kvinner")){
                Klasse = 2;
            }
            else if (klasse.contains("Junior A gutter")){
                Klasse = 3;
            }
            else if (klasse.contains("Junior A jenter")){
                Klasse = 4;
            }
            else if (klasse.contains("Junior B gutter")){
                Klasse = 5;
            }
            else if (klasse.contains("Junior B jenter")){
                Klasse = 6;
            }
            else if (klasse.contains("Junior C gutter")){
                Klasse = 7;
            }
            else if (klasse.contains("Junior C jenter")){
                Klasse = 8;
            }
            klubbid = klubbID;
            String Fornavn = request.getParameter("fornavn");
            String Etternavn = request.getParameter("etternavn");
            int Fodt = Integer.parseInt(request.getParameter("fodt"));
            utoveri nyUtover = new utoveri(Kjonn, Klasse, klubbid, Fornavn, Etternavn, Fodt);
            alleutovere.insertUtover(nyUtover);


        }
    }


