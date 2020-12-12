package com.utover.alleutovere.servlets;

import com.utover.alleutovere.alleUtovere;
import com.utover.alleutovere.objekter.Utover;
import com.utover.alleutovere.objekter.utoveri;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EndreUtoverServlet", urlPatterns = {"/endreutover", "/oppdaterUtover"})
public class EndreUtoverServlet extends HttpServlet {
    private int Uid;
    private int klasseid;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getServletPath();

        switch (action) {
            case "/endreutover": //Step 1
                endreUtover(request, response);
                break;
            case "/oppdaterUtover": //Step 2
                oppdaterUtover(request, response);
                break;
        }
    }

    private void endreUtover(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Uid = Integer.parseInt(request.getParameter("id"));
        response.sendRedirect("endreutover.jsp");
    }


    public void oppdaterUtover(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String klasse = request.getParameter("klasse");
            if (klasse.contains("Senior menn")) {
                klasseid = 1;
            } else if (klasse.contains("Senior kvinner")) {
                klasseid = 2;
            } else if (klasse.contains("Junior A gutter")) {
                klasseid = 3;
            } else if (klasse.contains("Junior A jenter")) {
                klasseid = 4;
            } else if (klasse.contains("Junior B gutter")) {
                klasseid = 5;
            } else if (klasse.contains("Junior B jenter")) {
                klasseid = 6;
            } else if (klasse.contains("Junior C gutter")) {
                klasseid = 7;
            } else if (klasse.contains("Junior C jenter")) {
                klasseid = 8;
            }
            String fornavn = request.getParameter("fornavn");
            String etternavn = request.getParameter("etternavn");
            utoveri utover = new utoveri(Uid, klasseid, fornavn, etternavn);
            alleUtovere alleutover = new alleUtovere();
            alleutover.endreutover(utover);
        }
    }

