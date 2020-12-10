package com.innlogging;

import com.trener.Trener;
import com.trener.trenerlogikk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TrenerServlet", urlPatterns = { "/hentTrener1"})
public class TrenerServlet extends HttpServlet {
    private int klubbID;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int klubbid = 0;
        Cookie cookies[] = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("KLUBBID"))
                klubbid = Integer.parseInt(c.getValue());
            klubbID = klubbid;
        }

        String action = request.getServletPath();

        try {
            switch (action) {
                case "/hentTrener":
                    hentTrener(request, response);
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
}
