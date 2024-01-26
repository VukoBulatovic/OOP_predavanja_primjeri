package oop10.hesiranje;

import java.util.Objects;

public class Covek {
    private String ime;
    private int brojGodina;

    public Covek(String ime, int brojGodina) {
        this.ime = ime;
        this.brojGodina = brojGodina;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    /*
     * Hash funkcije:
     * - Funkcije koje slikaju neki skup podataka (npr. objekte)
     *   u neki broj (int)
     * Hash funkcije su po pravilu:
     * 1. Jako brze za izracunjavanje
     * 2. Idealno, injetikvne, tj "1-1"
     * 3. Nije invertibilna
     *
     *
     * Posledica:
     * 1. Ako imamo dva razlicita hash koda, onda imamo i dva razlicita objekta.
     * 2. Ako imamo dva ista hash koda, to ne znaci da imamo i dva ista objekta.
     *
     *
     * */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Covek covek = (Covek) o;
        return brojGodina == covek.brojGodina && Objects.equals(ime, covek.ime);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ime == null) ? 0 : ime.hashCode());
        result = prime * result + brojGodina;
        return result;
    }

    public static void main(String[] args) {
        Covek c1 = new Covek("ime", 22);
        Covek c2 = new Covek("ime", 22);

        System.out.println(c1.getIme());
        System.out.println(c2.getIme());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        c2.setIme("qwe");
        System.out.println(c1.getIme());
        System.out.println("===================");
        System.out.println(c1);
        System.out.println(c2);
    }
}
