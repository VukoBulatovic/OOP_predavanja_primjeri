package oop4.softwareZaSkoluNasledjivanje.knjizaraZadatak;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Osoba o1 = new Osoba("Vuko", "Bulatovic", 25);
        Osoba o2 = new Osoba("Marko","Markovic",23);
        ArrayList<Osoba> zaposleni = new ArrayList<>();
        zaposleni.add(o1);
        zaposleni.add(o2);


        Knjiga k1 = new Knjiga("Tvrdjava",230,100,null);
        ArrayList<Knjiga> knjigeNaStanju = new ArrayList<>();
        knjigeNaStanju.add(k1);


        Autor a1 = new Autor("i1", "p1", 222,knjigeNaStanju);
        k1.setAutor(a1);

        Knjiga k2 = new Knjiga("knjiga 2", 100,300,null);
        knjigeNaStanju.add(k2);
        k2.setAutor(a1);

        Knjiga k3 = new Knjiga("knjiga 3", 200,50,null);
        knjigeNaStanju.add(k3);
        Autor a2 = new Autor("i2","p2",333,new ArrayList<>());
        a2.getKnjigeKojeJeNapisao().add(k3);
        k3.setAutor(a2);


        ArrayList<Autor> autoriKojeIzdaje = new ArrayList<>();
        autoriKojeIzdaje.add(a1); autoriKojeIzdaje.add(a2);

        Knjizara delfi = new Knjizara(knjigeNaStanju,zaposleni,autoriKojeIzdaje);


        System.out.println("---------------Knjizara: -------------" + "\n");
        System.out.println(delfi);

        System.out.println("---------------Ukupna cena u knjizari: -------------" + "\n");
        System.out.println(delfi.ukupnaCena());

        System.out.println("---------------Knjige od autora a1: -------------" + "\n");
        System.out.println(delfi.knjigeOdAutora(a1));

        Autor a3 = new Autor(new ArrayList<>());
        System.out.println("---------------Knjige od autora a3: -------------" + "\n");
        System.out.println(delfi.knjigeOdAutora(a3));

    }

}
