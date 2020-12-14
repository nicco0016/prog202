package com.utover.alleutovere;

import com.dbTOOL;
import com.trener.Trener;
import com.utover.alleutovere.objekter.Utover;
import com.utover.alleutovere.objekter.utoveri;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getUID {
    private Connection connection;



    public List<utoveri> getallUIDSenior(utoveri param) throws SQLException {
        List<utoveri> senior = new ArrayList<>();
        try {
            String query = "SELECT uID, fornavn, etternavn FROM utover WHERE klubbID = ? AND klasseID < 3  ORDER by uID ASC;";


            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = (rs.getInt(1));
                String fornavn = (rs.getString(2));
                String etternavn = (rs.getString(3));
                senior.add(new utoveri(id, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
        return senior;
    }
    public List<utoveri> getallUIDJuniorA(utoveri param) throws SQLException {
        List<utoveri> jA = new ArrayList<>();
        try {
            String query = "SELECT uID, fornavn, etternavn FROM utover WHERE klubbID = ? AND klasseID BETWEEN 3 AND 4  ORDER by uID ASC;";


            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = (rs.getInt(1));
                String fornavn = (rs.getString(2));
                String etternavn = (rs.getString(3));
                jA.add(new utoveri(id, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
        return jA;
    }
    public List<utoveri> getallUIDJuniorB(utoveri param) throws SQLException {
        List<utoveri> jB = new ArrayList<>();
        try {
            String query = "SELECT uID, fornavn, etternavn FROM utover WHERE klubbID = ? AND klasseID BETWEEN 5 AND 6  ORDER by uID ASC;";


            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = (rs.getInt(1));
                String fornavn = (rs.getString(2));
                String etternavn = (rs.getString(3));
                jB.add(new utoveri(id, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
        return jB;
    }
    public List<utoveri> getallUIDJuniorC(utoveri param) throws SQLException {
        List<utoveri> jC = new ArrayList<>();
        try {
            String query = "SELECT uID, fornavn, etternavn FROM utover WHERE klubbID = ? AND klasseID BETWEEN 7 AND 8  ORDER by uID ASC;";


            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = (rs.getInt(1));
                String fornavn = (rs.getString(2));
                String etternavn = (rs.getString(3));
                jC.add(new utoveri(id, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
        return jC;
    }

    public void destroy () {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
