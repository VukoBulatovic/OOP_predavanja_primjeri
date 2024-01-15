package oop4.softwareZaSkoluNasledjivanje.osobe2SaNasledjivanjem;

public class ZTest {

    public static void main(String[] args) {

        Osoba marko = new Osoba("Marko", "Matic",24);
        System.out.println(marko);
        System.out.println("====================");

        Ucenik vuko = new Ucenik("Vuko","Bulatovic",30,2.6);
        System.out.println(vuko);
        System.out.println("====================");

        Profesor vukasin = new Profesor("Vukasin","Lukic",30,2_000_000.1);
        System.out.println(vukasin);
        System.out.println("====================");


    }

}
