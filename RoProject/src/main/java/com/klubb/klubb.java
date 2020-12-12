package com.klubb;

public class klubb {
    private String klubbNavn;
    private int antall;

    public klubb(String klubbNavn, int antall) {
        this.klubbNavn = klubbNavn;
        this.antall = antall;
    }
    public klubb() {
    }


    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getKlubbNavn() {
        return klubbNavn;
    }

    public void setKlubbNavn(String klubbNavn) {
        this.klubbNavn = klubbNavn;
    }
}
