package com.testresultater.alletestresultater.objekter;

public class Testresultati {
        private int uID;
        private int år;
        private int uke;
        private int klasseID;
        private float watt_60;
        private int bevegelighet;
        private float watt_5000_m;
        private String min_5000;
        private String sek_5000;
        private String tid_5000_m;
        private float watt_2000_m;
        private String min_2000;
        private String sek_2000;
        private String tid_2000_m;
        private float prosent_ligg_ro;
        private float kilo_ligg_ro;
        private float prosent_knebøy;
        private float kilo_knebøy;
        private float Cm_Sargeant;
        private int totalSek_3000_m;
        private String sek_3000_m;
        private String min_3000_m;
        private int antall_Kr_hev;
        private String _3000_løp;
        private float score;
        private String fornavn;
        private String etternavn;


    public Testresultati(int uID, int år, int uke, int klasseID, float watt_60, int bevegelighet, float watt_5000_m, String tid_5000_m, float watt_2000_m, String tid_2000_m, float prosent_ligg_ro, float kilo_ligg_ro, float prosent_knebøy, float kilo_knebøy, float cm_Sargeant, String sek_3000_m, String min_3000_m, int antall_Kr_hev, String _3000_løp, float score, String fornavn, String etternavn) {
        this.uID = uID;
        this.år = år;
        this.uke = uke;
        this.klasseID = klasseID;
        this.watt_60 = watt_60;
        this.bevegelighet = bevegelighet;
        this.watt_5000_m = watt_5000_m;
        this.tid_5000_m = tid_5000_m;
        this.watt_2000_m = watt_2000_m;
        this.tid_2000_m = tid_2000_m;
        this.prosent_ligg_ro = prosent_ligg_ro;
        this.kilo_ligg_ro = kilo_ligg_ro;
        this.prosent_knebøy = prosent_knebøy;
        this.kilo_knebøy = kilo_knebøy;
        Cm_Sargeant = cm_Sargeant;
        this.sek_3000_m = sek_3000_m;
        this.min_3000_m = min_3000_m;
        this.antall_Kr_hev = antall_Kr_hev;
        this._3000_løp = _3000_løp;
        this.score = score;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Testresultati(int uID, int år, int uke, int klasseID, float watt_60, int bevegelighet, float watt_5000_m, String tid_5000_m, float watt_2000_m, String tid_2000_m, float prosent_ligg_ro, float kilo_ligg_ro, float prosent_knebøy, float kilo_knebøy, float cm_Sargeant, String sek_3000_m, String min_3000_m, int antall_Kr_hev, String _3000_løp, float score) {
        this.uID = uID;
        this.år = år;
        this.uke = uke;
        this.klasseID = klasseID;
        this.watt_60 = watt_60;
        this.bevegelighet = bevegelighet;
        this.watt_5000_m = watt_5000_m;
        this.tid_5000_m = tid_5000_m;
        this.watt_2000_m = watt_2000_m;
        this.tid_2000_m = tid_2000_m;
        this.prosent_ligg_ro = prosent_ligg_ro;
        this.kilo_ligg_ro = kilo_ligg_ro;
        this.prosent_knebøy = prosent_knebøy;
        this.kilo_knebøy = kilo_knebøy;
        Cm_Sargeant = cm_Sargeant;
        this.sek_3000_m = sek_3000_m;
        this.min_3000_m = min_3000_m;
        this.antall_Kr_hev = antall_Kr_hev;
        this._3000_løp = _3000_løp;
        this.score = score;
    }


    public Testresultati(int år, int uke, int uID, int klasseID, float watt_60, int bevegelighet, float watt_5000_m, String min_5000, String sek_5000, float watt_2000_m, String min_2000, String sek_2000, float prosent_ligg_ro, float kilo_ligg_ro, float prosent_knebøy, float kilo_knebøy) {
        this.år = år;
        this.uke = uke;
        this.uID = uID;
        this.klasseID = klasseID;
        this.watt_60 = watt_60;
        this.bevegelighet = bevegelighet;
        this.watt_5000_m = watt_5000_m;
        this.min_5000 = min_5000;
        this.sek_5000 = sek_5000;
        this.watt_2000_m = watt_2000_m;
        this.min_2000 = min_2000;
        this.sek_2000 = sek_2000;
        this.prosent_ligg_ro = prosent_ligg_ro;
        this.kilo_ligg_ro = kilo_ligg_ro;
        this.prosent_knebøy = prosent_knebøy;
        this.kilo_knebøy = kilo_knebøy;
    }


    public Testresultati(int år, int uke, int klasseID) {
        this.år = år;
        this.uke = uke;
        this.klasseID = klasseID;
    }
    //JuniorA
    public Testresultati(int uID, int år, int uke, int klasseID, float watt_60, int bevegelighet, float watt_5000_m, String min_5000, String sek_5000, float watt_2000_m, String min_2000, String sek_2000, float prosent_ligg_ro, float kilo_ligg_ro, float cm_Sargeant) {
        this.uID = uID;
        this.år = år;
        this.uke = uke;
        this.klasseID = klasseID;
        this.watt_60 = watt_60;
        this.bevegelighet = bevegelighet;
        this.watt_5000_m = watt_5000_m;
        this.min_5000 = min_5000;
        this.sek_5000 = sek_5000;
        this.watt_2000_m = watt_2000_m;
        this.min_2000 = min_2000;
        this.sek_2000 = sek_2000;
        this.prosent_ligg_ro = prosent_ligg_ro;
        this.kilo_ligg_ro = kilo_ligg_ro;
        Cm_Sargeant = cm_Sargeant;
    }
    //JuniorB
    public Testresultati(int uID, int år, int uke, int klasseID, float watt_60, int bevegelighet, float watt_2000_m, int totalSek_3000_m ,String sek_3000_m, String min_3000_m, String min_2000, String sek_2000, int antall_Kr_hev, float cm_Sargeant) {
        this.uID = uID;
        this.år = år;
        this.uke = uke;
        this.klasseID = klasseID;
        this.watt_60 = watt_60;
        this.bevegelighet = bevegelighet;
        this.watt_2000_m = watt_2000_m;
        this.totalSek_3000_m = totalSek_3000_m;
        this.sek_3000_m = sek_3000_m;
        this.min_3000_m = min_3000_m;
        this.min_2000 = min_2000;
        this.sek_2000 = sek_2000;
        this.antall_Kr_hev = antall_Kr_hev;
        Cm_Sargeant = cm_Sargeant;
    }
    //JuniorC
    public Testresultati(int uID, int år, int uke, int klasseID, float watt_60, int bevegelighet, float cm_Sargeant, int antall_Kr_hev, String _3000_løp) {
        this.uID = uID;
        this.år = år;
        this.uke = uke;
        this.klasseID = klasseID;
        this.watt_60 = watt_60;
        this.bevegelighet = bevegelighet;
        Cm_Sargeant = cm_Sargeant;
        this.antall_Kr_hev = antall_Kr_hev;
        this._3000_løp = _3000_løp;
    }

    public Testresultati(int uID, int klasseID) {
        this.uID = uID;
        this.klasseID = klasseID;
    }

    public Testresultati(int uID) {
        this.uID = uID;
    }

   public Testresultati(){}

    public int getTotalSek_3000_m() {
        return totalSek_3000_m;
    }

    public void setTotalSek_3000_m(int totalSek_3000_m) {
        this.totalSek_3000_m = totalSek_3000_m;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public int getÅr() {
        return år;
    }

    public void setÅr(int år) {
        this.år = år;
    }

    public int getUke() {
        return uke;
    }

    public void setUke(int uke) {
        this.uke = uke;
    }

    public int getKlasseID() {
        return klasseID;
    }

    public void setKlasseID(int klasseID) {
        this.klasseID = klasseID;
    }

    public float getWatt_60() {
        return watt_60;
    }

    public void setWatt_60(float watt_60) {
        this.watt_60 = watt_60;
    }

    public int getBevegelighet() {
        return bevegelighet;
    }

    public void setBevegelighet(int bevegelighet) {
        this.bevegelighet = bevegelighet;
    }

    public float getWatt_5000_m() {
        return watt_5000_m;
    }

    public void setWatt_5000_m(float watt_5000_m) {
        this.watt_5000_m = watt_5000_m;
    }

    public String getTid_5000_m() {
        return tid_5000_m;
    }

    public void setTid_5000_m(String tid_5000_m) {
        this.tid_5000_m = tid_5000_m;
    }

    public float getWatt_2000_m() {
        return watt_2000_m;
    }

    public void setWatt_2000_m(float watt_2000_m) {
        this.watt_2000_m = watt_2000_m;
    }

    public String getTid_2000_m() {
        return tid_2000_m;
    }

    public void setTid_2000_m(String tid_2000_m) {
        this.tid_2000_m = tid_2000_m;
    }

    public float getProsent_ligg_ro() {
        return prosent_ligg_ro;
    }

    public void setProsent_ligg_ro(float prosent_ligg_ro) {
        this.prosent_ligg_ro = prosent_ligg_ro;
    }

    public float getKilo_ligg_ro() {
        return kilo_ligg_ro;
    }

    public void setKilo_ligg_ro(float kilo_ligg_ro) {
        this.kilo_ligg_ro = kilo_ligg_ro;
    }

    public float getProsent_knebøy() {
        return prosent_knebøy;
    }

    public void setProsent_knebøy(float prosent_knebøy) {
        this.prosent_knebøy = prosent_knebøy;
    }

    public float getKilo_knebøy() {
        return kilo_knebøy;
    }

    public void setKilo_knebøy(float kilo_knebøy) {
        this.kilo_knebøy = kilo_knebøy;
    }

    public float getCm_Sargeant() {
        return Cm_Sargeant;
    }

    public void setCm_Sargeant(float cm_Sargeant) {
        Cm_Sargeant = cm_Sargeant;
    }

    public String getSek_3000_m() {
        return sek_3000_m;
    }

    public void setSek_3000_m(String sek_3000_m) {
        this.sek_3000_m = sek_3000_m;
    }

    public String getMin_3000_m() {
        return min_3000_m;
    }

    public void setMin_3000_m(String min_3000_m) {
        this.min_3000_m = min_3000_m;
    }

    public int getAntall_Kr_hev() {
        return antall_Kr_hev;
    }

    public void setAntall_Kr_hev(int antall_Kr_hev) {
        this.antall_Kr_hev = antall_Kr_hev;
    }

    public String get_3000_løp() {
        return _3000_løp;
    }

    public void set_3000_løp(String _3000_løp) {
        this._3000_løp = _3000_løp;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getMin_5000() {
        return min_5000;
    }

    public void setMin_5000(String min_5000) {
        this.min_5000 = min_5000;
    }

    public String getSek_5000() {
        return sek_5000;
    }

    public void setSek_5000(String sek_5000) {
        this.sek_5000 = sek_5000;
    }

    public String getMin_2000() {
        return min_2000;
    }

    public void setMin_2000(String min_2000) {
        this.min_2000 = min_2000;
    }

    public String getSek_2000() {
        return sek_2000;
    }

    public void setSek_2000(String sek_2000) {
        this.sek_2000 = sek_2000;
    }
}

