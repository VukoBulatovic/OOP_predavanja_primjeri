package oop6.interfejsi;

public class Pas implements Pokretljivost {

    private String ime;

    public Pas(String ime) {
        this.ime = ime;
    }


    @Override
    public void pokreniSe() {
        System.out.println("Ja trcim");
    }
}
