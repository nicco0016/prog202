package com.testresultater.alletestresultater;

import com.dbTOOL;
import com.testresultater.alletestresultater.objekter.Testresultati;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertModel {
    private Connection connection;



    public void insertTestresultat_mid_senior(Testresultati param){

        try {
            String query = "INSERT INTO testresultater_mid (uID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            connection = dbTOOL.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, param.getuID());
            statement.setInt(2, param.getÅr());
            statement.setInt(3, param.getUke());
            statement.setInt(4, param.getKlasseID());
            statement.setFloat(5, param.getWatt_60());
            statement.setInt(6, param.getBevegelighet());
            statement.setFloat(7, param.getWatt_5000_m());
            String tid5000 = param.getMin_5000() + "." + param.getSek_5000();
            statement.setString(8, tid5000);
            statement.setFloat(9, param.getWatt_2000_m());
            String tid2000 = param.getMin_2000() + "." + param.getSek_2000();
            statement.setString(10, tid2000);
            statement.setFloat(11, param.getProsent_ligg_ro());
            statement.setFloat(12, param.getKilo_ligg_ro());
            statement.setFloat(13, param.getProsent_knebøy());
            statement.setFloat(14, param.getKilo_knebøy());
            statement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            destroy();
        }

    }

    public void insertTestresultat_mid_jA(Testresultati param) {
        try {
            String query = "INSERT INTO testresultater_mid (uID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, cm_Sargeant) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            connection = dbTOOL.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, param.getuID());
            statement.setInt(2, param.getÅr());
            statement.setInt(3, param.getUke());
            statement.setInt(4, param.getKlasseID());
            statement.setFloat(5, param.getWatt_60());
            statement.setInt(6, param.getBevegelighet());
            statement.setFloat(7, param.getWatt_5000_m());
            String tid5000 = param.getMin_5000() + "." + param.getSek_5000();
            statement.setString(8, tid5000);
            statement.setFloat(9, param.getWatt_2000_m());
            String tid2000 = param.getMin_2000() + "." + param.getSek_2000();
            statement.setString(10, tid2000);
            statement.setFloat(11, param.getProsent_ligg_ro());
            statement.setFloat(12, param.getKilo_ligg_ro());
            statement.setFloat(13, param.getCm_Sargeant());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
    }

    public void insertTestresultat_mid_jB(Testresultati param) {
        try {
            String query = "INSERT INTO testresultater_mid (uID, år, uke, klasseID, watt_60, bevegelighet, sek_3000_m, min_3000_m, watt_2000_m, tid_2000_m, antall_Kr_Hev, cm_Sargeant) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            connection = dbTOOL.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, param.getuID());
            statement.setInt(2, param.getÅr());
            statement.setInt(3, param.getUke());
            statement.setInt(4, param.getKlasseID());
            statement.setFloat(5, param.getWatt_60());
            statement.setInt(6, param.getBevegelighet());
            statement.setFloat(7, param.getTotalSek_3000_m());
            String tid3000 = param.getMin_3000_m() + "." + param.getSek_3000_m();
            statement.setString(8, tid3000);
            statement.setFloat(9, param.getWatt_2000_m());
            String tid2000 = param.getMin_2000() + "." + param.getSek_2000();
            statement.setString(10, tid2000);
            statement.setInt(11, param.getAntall_Kr_hev());
            statement.setFloat(12, param.getCm_Sargeant());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
    }



    public void insertTestresultat_mid_jC(Testresultati param){
        try {
            String query = "INSERT INTO testresultater_mid (uID, år, uke, klasseID, watt_60, bevegelighet, cm_Sargeant, antall_Kr_hev, _3000_løp) values(?,?,?,?,?,?,?,?,?)";
            connection = dbTOOL.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, param.getuID());
            statement.setInt(2, param.getÅr());
            statement.setInt(3, param.getUke());
            statement.setInt(4, param.getKlasseID());
            statement.setFloat(5, param.getWatt_60());
            statement.setInt(6, param.getBevegelighet());
            statement.setFloat(7, param.getCm_Sargeant());
            statement.setInt(8, param.getAntall_Kr_hev());
            statement.setString(9, param.get_3000_løp());
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            destroy();
        }

    }

    public void destroy () {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }

