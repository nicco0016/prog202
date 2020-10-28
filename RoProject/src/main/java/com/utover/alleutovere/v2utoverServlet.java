package com.utover.alleutovere;

import com.utover.alleutovere.alleUtovere;
import com.utover.alleutovere.Utover;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "v2utoverServlet", urlPatterns = {"/v2utoverServlet", "/alleutovere", "/hentEn" })
public class v2utoverServlet extends HttpServlet {
    private alleUtovere alleutovere;

    public void init(){
        alleutovere = new alleUtovere();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getServletPath();

        try {
            switch (action) {
                case "/alleutovere":
                    Listalleutovere(request, response);
                    break;
                case "/hentEn":
                    hentEn(request, response);
            }
        } catch (SQLException e) {
            throw new ServletException();
        }
    }



        private void Listalleutovere(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
            List<Utover> listUtover = alleutovere.listOppAlleUtovere();
            request.setAttribute("listUtovere", listUtover);
            RequestDispatcher dispatcher = request.getRequestDispatcher("MineUtovereTrener.jsp");
            dispatcher.forward(request, response);

    }


    public void hentEn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int utøverID = 71;

        Utover utv = new Utover(utøverID);
        utv = alleutovere.hentEn(utv);


        int UtøverID = utv.getuID();
        String Kjonn = utv.getKjonnID();
        String Roklubb = utv.getKlubbID();
        String Roklasse = utv.getKlasseID();
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
