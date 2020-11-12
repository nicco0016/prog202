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

@WebServlet(name = "v2utoverServlet", urlPatterns = {"/v2utoverServlet", "/alleutovere", "/hentEn", "/klubbUtovere" })
public class v2utoverServlet extends HttpServlet {
      private int Uid;
      private String roklubb;
      private int klasse;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int uid = 0;
        Cookie cookies[] = request.getCookies();
        for (Cookie c : cookies){
            if (c.getName().equals("UID"))
                uid = Integer.parseInt(c.getValue());
                Uid = uid;

        }



        String klubb = request.getParameter("roklubb");
        roklubb = klubb;

        String action = request.getServletPath();

        try {
            switch (action) {
                case "/alleutovere":
                    Listalleutovere(request, response);
                    break;
                case "/hentEn":
                    hentEn(request, response);
                    break;
                case "/klubbUtovere":
                    Listalleutovere(request, response);
                    break;


            }
        } catch (SQLException e) {
            throw new ServletException();
        }
    }




    private void Listalleutovere(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

            Utover utover = new Utover(roklubb);
            alleUtovere alleutovere = new alleUtovere();
            List<Utover> listUtover = alleutovere.listOppAlleUtovere(utover);
            request.setAttribute("listUtovere", listUtover);
            RequestDispatcher dispatcher = request.getRequestDispatcher("MineUtovereTrener.jsp");
            dispatcher.forward(request, response);

    }


    public void hentEn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int utøverID = Uid;

        alleUtovere alleutovere = new alleUtovere();
        Utover utv = new Utover(utøverID);
        utv = alleutovere.hentEn(utv);


        int UtøverID = utv.getuID();
        String Kjonn = utv.getKjonnID();
        String Roklubb = utv.getKlubbID();
        String Roklasse = utv.getKlasseID();
        if (Roklasse.contains("Senior menn")){
            klasse = 1;
        }
        else if (Roklasse.contains("Senior kvinner")){
            klasse = 2;
        }
        else if (Roklasse.contains("Junior A gutter")){
            klasse = 3;
        }
        else if (Roklasse.contains("Junior A jenter")){
            klasse = 4;
        }
        else if (Roklasse.contains("Junior B gutter")){
            klasse = 5;
        }
        else if (Roklasse.contains("Junior B jenter")){
            klasse = 6;
        }
        else if (Roklasse.contains("Junior C gutter")){
            klasse = 7;
        }
        else if (Roklasse.contains("Junior C jenter")){
            klasse = 8;
        }
        Cookie coockie = new Cookie("ROKLASSE", klasse + "");
        response.addCookie(coockie);
        String Fornavn = utv.getFornavn();
        String Etternavn = utv.getEtternavn();
        int Fodt = utv.getFodt();


        request.setAttribute("utoverid", UtøverID);
        request.setAttribute("kjonn", Kjonn);
        request.setAttribute("roklubb", Roklubb);
        request.setAttribute("roklasse", Roklasse);
        request.setAttribute("fornavn", Fornavn);
        request.setAttribute("etternavn", Etternavn);
        request.setAttribute("fodt", Fodt);
        request.getRequestDispatcher("utoverpage.jsp").forward(request, response);
    }



}
