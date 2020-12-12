package com.innlogging;

import com.trener.Trener;
import com.trener.trenerlogikk;
import com.utover.alleutovere.alleUtovere;
import com.utover.alleutovere.objekter.Utover;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "innloggingServlet", urlPatterns = { "/hentTrener", "/hentUtover"})
public class innloggingServlet extends HttpServlet {
    private int klubbID;
    private int Uid;
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

        int klubbid = 0;
        Cookie cookiies[] = request.getCookies();
        for (Cookie c : cookiies) {
            if (c.getName().equals("KLUBBID"))
                klubbid = Integer.parseInt(c.getValue());
            klubbID = klubbid;
        }

        String action = request.getServletPath();

        try {
            switch (action) {
                case "/hentTrener": //Henter Trener
                    hentTrener(request, response);
                    break;
                case "/hentUtover": //Henter Utøver
                    hentUtover(request, response);
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void hentTrener(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int klubbId = klubbID;
        trenerlogikk trenlog = new trenerlogikk();
        Trener trener = new Trener(klubbId);
        trener = trenlog.hentTrener(trener);

        int klubbid = trener.getKlubbID();
        String klubbnavn = trener.getKlubbNavn();

        request.setAttribute("KlubbId", klubbid);
        request.setAttribute("KlubbNavn", klubbnavn);
        request.getRequestDispatcher("trenerpage.jsp").forward(request, response);


    }

    public void hentUtover(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
