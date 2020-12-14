package com.testresultater.alletestresultater;


import com.dbTOOL;
import com.testresultater.alletestresultater.objekter.Testresultati;
import com.testresultater.alletestresultater.objekter.testresultat;
import com.trener.Trener;
import com.utover.alleutovere.objekter.Utover;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class alleTestresultater {
    private Connection connection;

public List<testresultat> listOppAlleTestresultater(List<testresultat> parameter) throws SQLException {
        List<testresultat> testresultater = new ArrayList<>();

        testresultat testres = parameter.get(0);


        try {

            String query = "select\n" +
                    "testresultater.uID,\n" +
                    "år,\n" +
                    "uke,\n" +
                    "roklasse.klasseType,\n" +
                    "score,\n" +
                    "watt_60,\n" +
                    "bevegelighet,\n" +
                    "watt_5000_m,\n" +
                    "tid_5000_m,\n" +
                    "watt_2000_m,\n" +
                    "tid_2000_m,\n" +
                    "prosent_ligg_ro,\n" +
                    "kilo_ligg_ro,\n" +
                    "prosent_knebøy,\n" +
                    "kilo_knebøy,\n" +
                    "cm_Sargeant,\n" +
                    "sek_3000_m,\n" +
                    "min_3000_m,\n" +
                    "antall_Kr_hev,\n" +
                    "_3000_løp,\n" +
                    "utover.fornavn,\n" +
                    "utover.etternavn\n" +
                    "from testresultater testresultater\n" +
                    "join roKlasse roklasse\n" +
                    "on testresultater.klasseID = roklasse.klasseID\n" +
                    "join utover utover\n" +
                    "on testresultater.uID = utover.uID\n" +
                    "where år = ? and uke = ? and klasseType = ? order by score desc ";
            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, testres.getÅr());
            preparedStatement.setInt(2, testres.getUke());
            preparedStatement.setString(3, testres.getKlasseID());
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                int uID = (rs.getInt("uID"));
                int år = (rs.getInt("år"));
                int uke = (rs.getInt("uke"));
                String klasseID = (rs.getString("klasseType"));
                float watt_60 = (rs.getFloat("watt_60"));
                int bevegelighet = (rs.getInt("bevegelighet"));
                float watt_5000_m = (rs.getFloat("watt_5000_m"));
                String tid_5000_m = (rs.getString("tid_5000_m"));
                float watt_2000_m = (rs.getFloat("watt_2000_m"));
                String tid_2000_m = (rs.getString("tid_2000_m"));
                float prosent_ligg_ro = (rs.getFloat("prosent_ligg_ro"));
                float kilo_ligg_ro = (rs.getFloat("kilo_ligg_ro"));
                float prosent_knebøy = (rs.getFloat("prosent_knebøy"));
                float kilo_knebøy = (rs.getFloat("kilo_knebøy"));
                float Cm_Sargeant = (rs.getFloat("cm_Sargeant"));
                float sek_3000_m = (rs.getFloat("sek_3000_m"));
                String min_3000_m = (rs.getString("min_3000_m"));
                int antall_Kr_hev = (rs.getInt("antall_Kr_hev"));
                String _3000_løp = (rs.getString("_3000_løp"));
                float score = (rs.getFloat("score"));
                String fornavn = (rs.getString("fornavn"));
                String etternavn = (rs.getString("etternavn"));
                testresultater.add(new testresultat(uID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy, Cm_Sargeant, sek_3000_m, min_3000_m, antall_Kr_hev, _3000_løp, score, fornavn, etternavn));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
        return testresultater;
}
    public List<testresultat> listOppEnUtover(testresultat param){
        List<testresultat> testresultater = new ArrayList<>();
       try {
           String query = "SELECT år, uke, score, rk.klasseType, watt_60, bevegelighet, watt_5000_m, tid_5000_m,\n" +
                   "watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro,\n" +
                   "prosent_knebøy, kilo_knebøy, cm_Sargeant,\n" +
                   "sek_3000_m, min_3000_m, antall_Kr_Hev, _3000_løp\n" +
                   "FROM testresultater t\n" +
                   "INNER JOIN roKlasse rk\n" +
                   "\tON t.klasseID = rk.klasseID\n" +
                   "WHERE uID = ?;";
           connection = dbTOOL.createConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(query);
           preparedStatement.setInt(1, param.getuID());
           ResultSet rs = preparedStatement.executeQuery();

           while (rs.next()){
               int år = (rs.getInt("år"));
               int uke = (rs.getInt("uke"));
               float score = (rs.getFloat("score"));
               String  klasseID = (rs.getString( "klasseType"));
               float watt_60 = (rs.getFloat("watt_60"));
               int bevegelighet = (rs.getInt("bevegelighet"));
               float watt_5000_m = (rs.getFloat("watt_5000_m"));
               String tid_5000_m = (rs.getString("tid_5000_m"));
               float watt_2000_m = (rs.getFloat("watt_2000_M"));
               String tid_2000_m = (rs.getString("tid_2000_m"));
               float prosent_ligg_ro = (rs.getFloat("prosent_ligg_ro"));
               float kilo_ligg_ro = (rs.getFloat("kilo_ligg_ro"));
               float prosent_knebøy = (rs.getFloat("prosent_knebøy"));
               float kilo_knebøy = (rs.getFloat("kilo_knebøy"));
               float Cm_Sargeant = (rs.getFloat("cm_Sargeant"));
               float sek_3000_m = (rs.getFloat("sek_3000_m"));
               String min_3000_m = (rs.getString("min_3000_m"));
               int antall_Kr_Hev = (rs.getInt("antall_Kr_Hev"));
               String _3000_løp = (rs.getString("_3000_løp"));
               testresultater.add(new testresultat(år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy, Cm_Sargeant, sek_3000_m, min_3000_m, antall_Kr_Hev, _3000_løp, score));
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }finally {
           destroy();
       }
       return testresultater;
    }

    public List<Testresultati> sammenlignbeste(Testresultati testres) throws SQLException {
        List<Testresultati> listesammenlignbeste = new ArrayList<>();
        try {
            String query = "SELECT t.uID, t.år, t.uke, t.klasseID, t.watt_60, t.bevegelighet, t.watt_5000_M, t.tid_5000_m, t.watt_2000_M, t.tid_2000_m, t.prosent_ligg_ro, t.kilo_ligg_ro,\n" +
                    "t.prosent_knebøy, t.kilo_knebøy, t.cm_Sargeant, t.sek_3000_m, t.min_3000_m, t.antall_Kr_Hev, t._3000_løp, t.score, u.fornavn, u.etternavn\n" +
                    "FROM testresultater t\n" +
                    "INNER JOIN utover u USING(uID)\n" +
                    "WHERE t.klasseID = ? \n" +
                    "ORDER by score desc\n" +
                    "limit 10;";
            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,testres.getuID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int uID = (rs.getInt("uID"));
                int år = (rs.getInt("år"));
                int uke = (rs.getInt("uke"));
                int klasseID = (rs.getInt("klasseID"));
                float watt_60 = (rs.getFloat("watt_60"));
                int bevegelighet = (rs.getInt("bevegelighet"));
                float watt_5000_m = (rs.getFloat("watt_5000_m"));
                String tid_5000_m = (rs.getString("tid_5000_m"));
                float watt_2000_m = (rs.getFloat("watt_2000_m"));
                String tid_2000_m = (rs.getString("tid_2000_m"));
                float prosent_ligg_ro = (rs.getFloat("prosent_ligg_ro"));
                float kilo_ligg_ro = (rs.getFloat("kilo_ligg_ro"));
                float prosent_knebøy = (rs.getFloat("prosent_knebøy"));
                float kilo_knebøy = (rs.getFloat("kilo_knebøy"));
                float Cm_Sargeant = (rs.getFloat("cm_Sargeant"));
                String sek_3000_m = rs.getString("sek_3000_m");
                String min_3000_m = (rs.getString("min_3000_m"));
                int antall_Kr_hev = (rs.getInt("antall_Kr_hev"));
                String _3000_løp = (rs.getString("_3000_løp"));
                float score = (rs.getFloat("score"));
                String fornavn = (rs.getString("fornavn"));
                String etternavn = (rs.getString("etternavn"));
                listesammenlignbeste.add(new Testresultati(uID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy, Cm_Sargeant, sek_3000_m, min_3000_m, antall_Kr_hev, _3000_løp, score, fornavn, etternavn));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
        return listesammenlignbeste;
    }

    public List<testresultat> sammenlignutover(testresultat testres) {
            List<testresultat> listesammenlign = new ArrayList<>();
            try {
                String query = "SELECT t.uID, t.år, t.uke, r.klasseType, t.watt_60, t.bevegelighet, t.watt_5000_M, t.tid_5000_m, t.watt_2000_M, t.tid_2000_m, t.prosent_ligg_ro, t.kilo_ligg_ro,\n" +
                        "t.prosent_knebøy, t.kilo_knebøy, t.cm_Sargeant, t.sek_3000_m, t.min_3000_m, t.antall_Kr_Hev, t._3000_løp, t.score, u.fornavn, u.etternavn\n" +
                        "FROM testresultater t\n" +
                        "INNER JOIN roKlasse r USING (klasseID)\n" +
                        "INNER JOIN utover u USING(uID)\n" +
                        "WHERE uID = ?";
                connection = dbTOOL.createConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1,testres.getuID());
                ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int uID = (rs.getInt("uID"));
                int år = (rs.getInt("år"));
                int uke = (rs.getInt("uke"));
                String klasseID = (rs.getString("klasseType"));
                float watt_60 = (rs.getFloat("watt_60"));
                int bevegelighet = (rs.getInt("bevegelighet"));
                float watt_5000_m = (rs.getFloat("watt_5000_m"));
                String tid_5000_m = (rs.getString("tid_5000_m"));
                float watt_2000_m = (rs.getFloat("watt_2000_m"));
                String tid_2000_m = (rs.getString("tid_2000_m"));
                float prosent_ligg_ro = (rs.getFloat("prosent_ligg_ro"));
                float kilo_ligg_ro = (rs.getFloat("kilo_ligg_ro"));
                float prosent_knebøy = (rs.getFloat("prosent_knebøy"));
                float kilo_knebøy = (rs.getFloat("kilo_knebøy"));
                float Cm_Sargeant = (rs.getFloat("cm_Sargeant"));
                float sek_3000_m = (rs.getFloat("sek_3000_m"));
                String min_3000_m = (rs.getString("min_3000_m"));
                int antall_Kr_hev = (rs.getInt("antall_Kr_hev"));
                String _3000_løp = (rs.getString("_3000_løp"));
                float score = (rs.getFloat("score"));
                String fornavn = (rs.getString("fornavn"));
                String etternavn = (rs.getString("etternavn"));
                listesammenlign.add(new testresultat(uID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy, Cm_Sargeant, sek_3000_m, min_3000_m, antall_Kr_hev, _3000_løp, score, fornavn, etternavn));

            }




            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                destroy();
            }

        return listesammenlign;
    }

    public List<testresultat> sammenlignUtoverMotKlasse(Testresultati testres) {
        List<testresultat> listesammenlign = new ArrayList<>();
        try {
            String query = "SELECT t.uID, t.år, t.uke, r.klasseType, t.watt_60, t.bevegelighet, t.watt_5000_M, t.tid_5000_m, t.watt_2000_M, t.tid_2000_m, t.prosent_ligg_ro, t.kilo_ligg_ro,\n" +
                    "t.prosent_knebøy, t.kilo_knebøy, t.cm_Sargeant, t.sek_3000_m, t.min_3000_m, t.antall_Kr_Hev, t._3000_løp, t.score, u.fornavn, u.etternavn\n" +
                    "FROM testresultater t\n" +
                    "INNER JOIN roKlasse r USING (klasseID)\n" +
                    "INNER JOIN utover u USING(uID)\n" +
                    "WHERE uID = ? AND t.klasseID = ?";
            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,testres.getuID());
            preparedStatement.setInt(2,testres.getKlasseID());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int uID = (rs.getInt("uID"));
                int år = (rs.getInt("år"));
                int uke = (rs.getInt("uke"));
                String klasseID = (rs.getString("klasseType"));
                float watt_60 = (rs.getFloat("watt_60"));
                int bevegelighet = (rs.getInt("bevegelighet"));
                float watt_5000_m = (rs.getFloat("watt_5000_m"));
                String tid_5000_m = (rs.getString("tid_5000_m"));
                float watt_2000_m = (rs.getFloat("watt_2000_m"));
                String tid_2000_m = (rs.getString("tid_2000_m"));
                float prosent_ligg_ro = (rs.getFloat("prosent_ligg_ro"));
                float kilo_ligg_ro = (rs.getFloat("kilo_ligg_ro"));
                float prosent_knebøy = (rs.getFloat("prosent_knebøy"));
                float kilo_knebøy = (rs.getFloat("kilo_knebøy"));
                float Cm_Sargeant = (rs.getFloat("cm_Sargeant"));
                float sek_3000_m = (rs.getFloat("sek_3000_m"));
                String min_3000_m = (rs.getString("min_3000_m"));
                int antall_Kr_hev = (rs.getInt("antall_Kr_hev"));
                String _3000_løp = (rs.getString("_3000_løp"));
                float score = (rs.getFloat("score"));
                String fornavn = (rs.getString("fornavn"));
                String etternavn = (rs.getString("etternavn"));
                listesammenlign.add(new testresultat(uID, år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, prosent_knebøy, kilo_knebøy, Cm_Sargeant, sek_3000_m, min_3000_m, antall_Kr_hev, _3000_løp, score, fornavn, etternavn));

            }




        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }

        return listesammenlign;
    }


public void destroy () {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
