package com.trener;

import com.dbTOOL;

import java.sql.*;

public class trenerlogikk {
    private Connection connection;



    public Trener hentTrener(Trener param){
        Trener trener = null;

        try {
            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT klubbID, klubbNavn from klubb where klubbID = ? ");
            preparedStatement.setInt(1, param.getKlubbID());
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                int klubbID = (rs.getInt(1));
                String klubbNavn = (rs.getString(2));
                trener = new Trener(klubbID, klubbNavn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trener;
    }

}
