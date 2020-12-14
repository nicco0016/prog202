package com.utover.alleutovere;

import com.dbTOOL;
import com.testresultater.alletestresultater.objekter.Testresultati;
import com.utover.alleutovere.objekter.Utover;
import com.utover.alleutovere.objekter.utoveri;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class alleUtovere {
    private Connection connection;
    //private int UID;

    private String QUERY1 = "SELECT utover.uID, kjonn.kjonntype, klubb.klubbNavn, roKlasse.klasseType, utover.fornavn, utover.etternavn, utover.fodt\n" +
            "            from utover utover\n" +
            "            join kjonn kjonn\n" +
            "            on utover.kjonnID = kjonn.kjonnID\n" +
            "            join klubb klubb\n" +
            "            on utover.klubbID = klubb.klubbID\n" +
            "            join roKlasse roKlasse\n" +
            "            on utover.klasseID = roKlasse.klasseID where klubb.klubbNavn LIKE ? order by uID;";

    private String QUERY2 = "insert into utover values (?,?,?,?,?,?,?)";

    /*private String QUERY3 = "SELECT utover.uID, kjonn.kjonntype, klubb.klubbNavn, roKlasse.klasseType, utover.fornavn, utover.etternavn, utover.fodt\n" +
            "from utover utover\n" +
            "join kjonn kjonn\n" +
            "\ton utover.kjonnID = kjonn.kjonnID\n" +
            "join klubb klubb\n" +
            "\ton utover.klubbID = klubb.klubbID\n" +
            "join roKlasse roKlasse\n" +
            "\ton utover.klasseID = roKlasse.klasseID\n" +
            "where uid = '" + UID + "' ";*/

    /*public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }*/

    /*public Connection createConnection(){
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Roprosjekt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "adminroot");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.connection;
    }*/


    public List <Utover> listOppAlleUtovere(Utover param){
        List<Utover> utovere = new ArrayList<>();
        try {
            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY1);
            preparedStatement.setString(1, param.getKlubbID() );
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int Uid = (rs.getInt(1));
                String Kjonnid = (rs.getString(2));
                String Klubbid = (rs.getString(3));
                String Klasseid = (rs.getString(4));
                String Fornavn = (rs.getString(5));
                String Etternavn = (rs.getString(6));
                int Fodt = (rs.getInt(7));
                utovere.add(new Utover(Uid, Kjonnid, Klubbid, Klasseid, Fornavn, Etternavn, Fodt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
        return utovere;
    }

    public void insertUtover(utoveri utoverparam){
        try {
            int maxno = 0;
            String query1 = "SELECT max(uID)from utover";
            connection = dbTOOL.createConnection();
            PreparedStatement statement = connection.prepareStatement(query1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int sisteutover = (rs.getInt(1));
                maxno = sisteutover;
            }
            String query2 = "INSERT INTO utover VALUES(?,?,?,?,?,?,?)";
            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query2);
            int Maxno = maxno + 1;
            preparedStatement.setInt(1, Maxno);
            preparedStatement.setInt(2, utoverparam.getKjonnID());
            preparedStatement.setInt(3, utoverparam.getKlasseID());
            preparedStatement.setInt(4, utoverparam.getKlubbID());
            preparedStatement.setString(5, utoverparam.getFornavn());
            preparedStatement.setString(6, utoverparam.getEtternavn());
            preparedStatement.setInt(7, utoverparam.getFodt());
            preparedStatement.execute();




        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }

    }
    public Utover hentEn(Utover dummy) {
        Utover utover = null;

        try {
           // int id = (dummy.getuID());
            connection = dbTOOL.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT utover.uID, kjonn.kjonntype, klubb.klubbNavn, roKlasse.klasseType, utover.fornavn, utover.etternavn, utover.fodt\n" +
                    "from utover utover\n" +
                    "join kjonn kjonn\n" +
                    "\ton utover.kjonnID = kjonn.kjonnID\n" +
                    "join klubb klubb\n" +
                    "\ton utover.klubbID = klubb.klubbID\n" +
                    "join roKlasse roKlasse\n" +
                    "\ton utover.klasseID = roKlasse.klasseID\n" +
                    "where uid = '" + dummy.getuID() + "' ");

            while (rs.next()) {
                int uID = (rs.getInt(1));
                String kjonnID = (rs.getString(2));
                String klubbID = (rs.getString(3));
                String klasseID = (rs.getString(4));
                String fornavn = (rs.getString(5));
                String etternavn = (rs.getString(6));
                int fodt = (rs.getInt(7));
                utover = new Utover(uID, kjonnID, klubbID, klasseID, fornavn, etternavn, fodt);

            } } catch(SQLException e){
                e.printStackTrace();
            }finally {
            destroy();
        }

        return utover;

    }

    public void endreutover(utoveri param) {
        try {
            String query = "update utover set klasseID = ?, fornavn = ?, etternavn = ? where uID = ?";
            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getKlasseID());
            preparedStatement.setString(2, param.getFornavn());
            preparedStatement.setString(3, param.getEtternavn());
            preparedStatement.setInt(4, param.getuID());
            preparedStatement.execute();



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            destroy();
        }

    }

    public Testresultati getKlasseID (Testresultati param) {
        Testresultati testres = null;
        try {
            String query = "SELECT klasseID FROM Roprosjekt.utover  where uID = ?";
            connection = dbTOOL.createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param.getuID());
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                Integer klasseID = (rs.getInt("klasseID"));
                testres = new Testresultati();
                testres.setKlasseID(klasseID);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            destroy();
        }
        return testres;
    }



    public void destroy () {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

