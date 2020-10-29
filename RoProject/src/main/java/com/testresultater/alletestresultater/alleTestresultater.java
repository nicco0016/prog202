package com.testresultater.alletestresultater;


import com.testresultater.alletestresultater.objekter.Testresultati;
import com.testresultater.alletestresultater.objekter.testresultat;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class alleTestresultater {
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


    public void insertTestresultat(Testresultati testresparam)  {
        try {
            String query = "insert into testresultater values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, testresparam.getuID());
            statement.setInt(2, testresparam.getÅr());
            statement.setInt(3, testresparam.getUke());
            statement.setInt(4, testresparam.getKlasseID());
            statement.setFloat(5, testresparam.getWatt_60());
            statement.setInt(6, testresparam.getBevegelighet());
            statement.setFloat(7, testresparam.getWatt_2000_m());
            statement.setString(8, testresparam.getTid_5000_m());
            statement.setFloat(9, testresparam.getWatt_2000_m());
            statement.setString(10, testresparam.getTid_2000_m());
            statement.setFloat(11, testresparam.getProsent_ligg_ro());
            statement.setFloat(12, testresparam.getKilo_ligg_ro());
            statement.setFloat(13, testresparam.getProsent_knebøy());
            statement.setFloat(14, testresparam.getKilo_knebøy());
            statement.setFloat(15, testresparam.getCm_Sargeant());
            statement.setFloat(16, testresparam.getSek_3000_m());
            statement.setString(17, testresparam.getMin_3000_m());
            statement.setInt(18, testresparam.getAntall_Kr_hev());
            statement.setString(19, testresparam.get_3000_løp());
            statement.setFloat(20, testresparam.getScore());
            statement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            destroy();
        }
    }

    public void insertTestresultat_mid(Testresultati testresparam)  {
        try {
            String query = "insert into testresultater_mid values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, testresparam.getuID());
            statement.setInt(2, testresparam.getÅr());
            statement.setInt(3, testresparam.getUke());
            statement.setInt(4, testresparam.getKlasseID());
            statement.setFloat(5, testresparam.getWatt_60());
            statement.setInt(6, testresparam.getBevegelighet());
            statement.setFloat(7, testresparam.getWatt_2000_m());
            statement.setString(8, testresparam.getTid_5000_m());
            statement.setFloat(9, testresparam.getWatt_2000_m());
            statement.setString(10, testresparam.getTid_2000_m());
            statement.setFloat(11, testresparam.getProsent_ligg_ro());
            statement.setFloat(12, testresparam.getKilo_ligg_ro());
            statement.setFloat(13, testresparam.getProsent_knebøy());
            statement.setFloat(14, testresparam.getKilo_knebøy());
            statement.setFloat(15, testresparam.getCm_Sargeant());
            statement.setFloat(16, testresparam.getSek_3000_m());
            statement.setString(17, testresparam.getMin_3000_m());
            statement.setInt(18, testresparam.getAntall_Kr_hev());
            statement.setString(19, testresparam.get_3000_løp());
            statement.setFloat(20, testresparam.getScore());
            statement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            destroy();
        }
    }




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
            Connection connection = createConnection();
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
        }
        return testresultater;
}

    public List<testresultat> listOppAlleTestresultater_mid(List<testresultat> parameter) throws SQLException {
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
                    "from testresultater_mid testresultater\n" +
                    "join roKlasse roklasse\n" +
                    "on testresultater.klasseID = roklasse.klasseID\n" +
                    "join utover utover\n" +
                    "on testresultater.uID = utover.uID\n" +
                    "where klasseType = ? order by score desc ";
            Connection connection = createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, testres.getKlasseID());
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
        }
        return testresultater;
    }

    public List<testresultat> listOppEnUtover(){
        List<testresultat> testresultater = new ArrayList<>();
       try {
           String query = "SELECT \n" +
                   "t.år,\n" +
                   "t.uke,\n" +
                   "t.score,\n" +
                   "r.klasseType,\n" +
                   "t.watt_60,\n" +
                   "t.bevegelighet,\n" +
                   "t.watt_5000_m,\n" +
                   "t.tid_5000_m,\n" +
                   "t.watt_2000_M,\n" +
                   "t.tid_2000_m,\n" +
                   "t.prosent_ligg_ro,\n" +
                   "t.kilo_ligg_ro,\n" +
                   "t.prosent_knebøy,\n" +
                   "t.kilo_knebøy\n" +
                   "from testresultater t\n" +
                   "join utover u\n" +
                   "    on t.uID = u.uID\n" +
                   "    \n" +
                   "join roKlasse r\n" +
                   "\ton t.klasseID = r.klasseID\n" +
                   "where t.uID = 71;";
           Connection connection = createConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(query);
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
               testresultater.add(new testresultat(år, uke, klasseID, watt_60, bevegelighet, watt_5000_m, tid_5000_m, watt_2000_m, tid_2000_m, prosent_ligg_ro, kilo_ligg_ro, score));
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return testresultater;
    }

    public void insertTestresultat_ofc(testresultat testresparam)  {
        try {
            //String query = "insert into testresultater_mid values(?)";
            String query = "insert into testresultater(select * from testresultater_mid where uID = ?)";
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, testresparam.getuID());
            statement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            destroy();
        }
    }

    public void deleteTestresultat_mid(testresultat testresparam)  {
        try {
            //String query = "insert into testresultater_mid values(?)";
            String query = "delete from testresultater_mid where uID = ?";
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, testresparam.getuID());
            statement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
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
