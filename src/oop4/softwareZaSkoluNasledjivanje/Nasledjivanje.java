package oop4.softwareZaSkoluNasledjivanje;

public class Nasledjivanje {

    /*
    * extends - kljucna rijec koja govori da jedna klasa "nasledjuje" drugu klasu
    *
    * A <- neka klasa
    * public class B extends A { ... }
    * Ovim smo iskazali da klasa B nasledjuje klasu A
    * u nasem primjeru class Ucenik extends Osoba { .. } --
    * sto znaci da klasa Ucenik nasledjuje Osobu, ima jos nesto specificno
    *
    * kazemo da je B podklasa klase A
    * ondnosno da je A nadklasa klase B
    *
    *
    * Klasa B nasledjuje od Klase A - sve sto mu je vidljivo (sve sto je public, sto je private nece)
    * Klasa B ce pokupiti atribute iz klase A i imace svoje dodatne, bice kao unija svih atributa
    * Moramo prvo da kreiramo objekat klase A pa tek onda objekat klase B (popunimo atribute A)
    *
    * Svaka podklasa moze da naslijedi najvise SAMO JEDNU nadklasu
    * Nadklasa moze da ima koliko hoce podklasa
    *
    * - Method overriding
    *
    * class A {...; public void f(){}...}
    * class B extends A {...; public void f(){}...}
    * class C extends B {...; public void f(){}...}
    *
    * C objC = new C();
    * c.f(); <- poziva se implementacija metode f noja je najniza u hijerarhiji klasa.
    *
    * -Method overriding - klasa redefinise ponasanje metode koju nasledjuje iz natklase
    *
    * Svaka klasa prosiruje Object klasu, ona je na vrhu
    *
    *
    * */





}
