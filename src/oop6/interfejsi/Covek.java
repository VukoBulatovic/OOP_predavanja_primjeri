package oop6.interfejsi;

public class Covek implements Pokretljivost {

    private String ime;
    private String prezime;
    private int brGodina;

    public Covek(String ime, String prezime, int brGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brGodina = brGodina;
    }


    @Override
    public void pokreniSe() {
        System.out.println("Ja hodam");
    }


}
