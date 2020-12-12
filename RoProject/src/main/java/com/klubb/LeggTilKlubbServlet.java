package com.klubb;

import com.dbTOOL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LeggTilKlubbServlet", urlPatterns = {"/nyKlubb"})
public class LeggTilKlubbServlet extends HttpServlet {
    private Connection connection;
    private int klubbID;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nyKlubb = request.getParameter("nyklubb");

        try {
            String query1 = "select max(klubbID) from klubb";
            connection = dbTOOL.createConnection();
            PreparedStatement statement = connection.prepareStatement(query1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                klubbID = (rs.getInt(1));
                klubbID = klubbID + 1;
            }
            String query2 = "INSERT INTO klubb (klubbID,klubbNavn) VALUES (?,?)";
            statement  = connection.prepareStatement(query2);
            statement.setInt(1, klubbID);
            statement.setString(2, nyKlubb);
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
