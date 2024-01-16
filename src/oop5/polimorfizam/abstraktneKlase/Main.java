package oop5.polimorfizam.abstraktneKlase;

public class Main {
    public static void main(String[] args) {

        Automobil audi = new Automobil();
        audi.kreciSe();

        Vozilo v = new Automobil();
        v.kreciSe();

        Vozilo voz = new Vozilo(){};
        voz.kreciSe();



    }

}
