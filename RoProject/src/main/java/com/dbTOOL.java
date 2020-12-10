package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbTOOL {
    private static Connection connection;

    public static Connection createConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Roprosjekt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "adminroot");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
