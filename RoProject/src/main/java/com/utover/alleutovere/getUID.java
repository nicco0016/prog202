package com.utover.alleutovere;

import com.testresultater.alletestresultater.alleresultatParameter;
import com.trener.Trener;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getUID {
    private Connection connection;
    private alleresultatParameter alleresparam;

    public Connection createConnection(){
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Roprosjekt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "adminroot");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.connection;
    }
    public List<Trener> getallUIDSenior(Trener param) throws SQLException {
        List<Trener> senior = new ArrayList<>();
        try {
            String query = "SELECT uID, fornavn, etternavn FROM utover WHERE klubbID = ? AND klasseID < 3  ORDER by uID ASC;";


            Connection connection = createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = (rs.getInt(1));
                String fornavn = (rs.getString(2));
                String etternavn = (rs.getString(3));
                senior.add(new Trener(id, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return senior;
    }
    public List<Trener> getallUIDJuniorA(Trener param) throws SQLException {
        List<Trener> jA = new ArrayList<>();
        try {
            String query = "SELECT uID, fornavn, etternavn FROM utover WHERE klubbID = ? AND klasseID BETWEEN 3 AND 4  ORDER by uID ASC;";


            Connection connection = createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = (rs.getInt(1));
                String fornavn = (rs.getString(2));
                String etternavn = (rs.getString(3));
                jA.add(new Trener(id, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jA;
    }
    public List<Trener> getallUIDJuniorB(Trener param) throws SQLException {
        List<Trener> jB = new ArrayList<>();
        try {
            String query = "SELECT uID, fornavn, etternavn FROM utover WHERE klubbID = ? AND klasseID BETWEEN 5 AND 6  ORDER by uID ASC;";


            Connection connection = createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = (rs.getInt(1));
                String fornavn = (rs.getString(2));
                String etternavn = (rs.getString(3));
                jB.add(new Trener(id, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jB;
    }
    public List<Trener> getallUIDJuniorC(Trener param) throws SQLException {
        List<Trener> jC = new ArrayList<>();
        try {
            String query = "SELECT uID, fornavn, etternavn FROM utover WHERE klubbID = ? AND klasseID BETWEEN 7 AND 8  ORDER by uID ASC;";


            Connection connection = createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = (rs.getInt(1));
                String fornavn = (rs.getString(2));
                String etternavn = (rs.getString(3));
                jC.add(new Trener(id, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jC;
    }


}
