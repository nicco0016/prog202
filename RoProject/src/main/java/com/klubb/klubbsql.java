package com.klubb;

import com.dbTOOL;
import com.testresultater.alletestresultater.objekter.testresultat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class klubbsql {
    private Connection connection;

    public List<klubb> visAlleKLubber() throws SQLException {
    List<klubb> klubber = new ArrayList<>();

    try {
        String query = "SELECT k.klubbNavn, count(u.klubbID)from klubb k inner join utover u on k.klubbID = u.klubbID group by k.klubbNavn";
        connection = dbTOOL.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()){
            String klubbNavn = (rs.getString(1));
            int antall = (rs.getInt(2));
            klubber.add(new klubb(klubbNavn, antall));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return klubber;
    }
}



