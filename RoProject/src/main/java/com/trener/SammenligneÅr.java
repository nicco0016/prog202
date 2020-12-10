public List<Testresultati> SammeligneÅr(testresultat testres) {
        List<Testreesultati> listesammeligleår = new ArrayList<>();
        try {
        String query = "SELECT t.uID, t.år, t.uke, r.klasseType, t.watt_60, t.bevegelighet, t.watt_5000_M, t.tid_5000_m, t.watt_2000_M, t.tid_2000_m, t.prosent_ligg_ro, t.kilo_ligg_ro,\n" +
        "t.prosent_knebøy, t.kilo_knebøy, t.cm_Sargeant, t.sek_3000_m, t.min_3000_m, t.antall_Kr_Hev, t._3000_løp, t.score, u.fornavn, u.etternavn\n" +
        "FROM testresultater t\n" +
        "INNER JOIN roKlasse r USING (klasseID)\n" +
        "INNER JOIN utover u USING(uID)\n" +
        "WHERE uID = ? " +
        "AND år = IN ('2018', '2019')";
        Connection connection = createConnection();
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
        }

        return listesammenligneår;
        }
