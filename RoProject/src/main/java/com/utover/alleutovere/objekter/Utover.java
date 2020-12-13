package com.utover.alleutovere.objekter;

public class Utover {
    private int uID;
    private String kjonnID;
    private String klubbID;
    private String KlasseID;
    private String fornavn;
    private String etternavn;
    private int fodt;

    public Utover(int uID, String kjonnID, String klubbID, String klasseID, String fornavn, String etternavn, int fodt) {
        this.uID = uID;
        this.kjonnID = kjonnID;
        this.klubbID = klubbID;
        this.KlasseID = klasseID;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodt = fodt;
    }

    public Utover(int uID, String klasseID, String fornavn, String etternavn) {
        this.uID = uID;
        KlasseID = klasseID;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Utover(int uID, String fornavn, String etternavn) {
        this.uID = uID;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Utover(int uID) {
        this.uID = uID;
    }

    public Utover(String klubbID) {
        this.klubbID = klubbID;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getKjonnID() {
        return kjonnID;
    }

    public void setKjonnID(String kjonnID) {
        this.kjonnID = kjonnID;
    }

    public String getKlubbID() {
        return klubbID;
    }

    public void setKlubbID(String klubbID) {
        this.klubbID = klubbID;
    }

    public String getKlasseID() {
        return KlasseID;
    }

    public void setKlasseID(String klasseID) {
        KlasseID = klasseID;
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

    public int getFodt() {
        return fodt;
    }

    public void setFodt(int fodt) {
        this.fodt = fodt;
    }
}
