package oop9.enumi;

public enum SemaforskaSvetla {

    CRVENO("STOP"),
    ZUTO("KOCI/PRIPREMA"),
    ZELENO("KRENI");

    private String kreni;

    SemaforskaSvetla(String kreni) {
        this.kreni = kreni;
    }

    public String getKreni() {
        return kreni;
    }

    public void setKreni(String kreni) {
        this.kreni = kreni;
    }





}
