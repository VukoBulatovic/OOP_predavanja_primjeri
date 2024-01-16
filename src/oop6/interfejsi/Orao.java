package oop6.interfejsi;

public class Orao implements Pokretljivost {

    private double rasponKrila;

    public Orao(double rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    @Override
    public void pokreniSe() {
        System.out.println("Ja letim");
    }



}
