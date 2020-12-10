package com.trener;

public class Trener {
    private int klubbID;
    private String klubbNavn;
    private String fornavn;
    private String etternavn;

    public Trener(int klubbID, String klubbNavn, String fornavn, String etternavn) {
        this.klubbID = klubbID;
        this.klubbNavn = klubbNavn;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Trener(int klubbID, String fornavn, String etternavn) {
        this.klubbID = klubbID;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Trener(int klubbID, String klubbNavn) {
        this.klubbID = klubbID;
        this.klubbNavn = klubbNavn;
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

    public Trener(int klubbID) {
        this.klubbID = klubbID;
    }

    public Trener(String klubbNavn) {
        this.klubbNavn = klubbNavn;
    }

    public int getKlubbID() {
        return klubbID;
    }

    public void setKlubbID(int klubbID) {
        this.klubbID = klubbID;
    }

    public String getKlubbNavn() {
        return klubbNavn;
    }

    public void setKlubbNavn(String klubbNavn) {
        this.klubbNavn = klubbNavn;
    }
}

