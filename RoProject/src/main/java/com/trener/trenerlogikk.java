package com.trener;

import java.sql.*;

public class trenerlogikk {
    private Connection connection;

    public Connection createConnection(){
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Roprosjekt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "adminroot");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.connection;
    }

    public Trener hentTrener(Trener param){
        Trener trener = null;

        try {
            connection = createConnection();
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
