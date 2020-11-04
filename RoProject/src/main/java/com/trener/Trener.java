package com.trener;

public class Trener {
    private int klubbID;
    private String klubbNavn;

    public Trener(int klubbID, String klubbNavn) {
        this.klubbID = klubbID;
        this.klubbNavn = klubbNavn;
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

