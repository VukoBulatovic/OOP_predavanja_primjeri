package oop8.hashcodeIEquals;

import java.util.Objects;

public class Covek extends Object {

    private String ime;
    private String prezime;
    private int brojGodina;

    public Covek(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    /*
    * Ovaj override je nepotreban kao i extends Object --> pokazni primjer
    * Hashcode
    *
    * Hash funkcija je bilo koja funkcija koja slika neki skup u neki broj (String)
    *
    * Hash funkcije bi trebalo da budu:
    * -Jako brze za izracunavanje
    * -Da budu "1-1", tj da razliciti hashCodovi odgovaraju razlicitim originalima (objektima)
    * -Da ne budu invertibilni, tj da iz hashCoda ne mozemo da prikupimo informacije o objektu
    *
    * -Hash funkcije uglavnom NISU "1-1" i tada dolazi do hash kolizija....
    *
    * */
 /*   @Override
    public int hashCode() {
        return super.hashCode();
    }

    *//*
    * Ova metoda vraca odgovor na pitanje da li je prosledjen objekat jednak ovom nasem
    * *//*
    @Override
    public boolean equals(Object o){
        if(this == o)  //da li dele isti memorijski prostor
            return true;

        if(!(o instanceof Covek)) //Ako objekat o nije instanca klase covjek onda nisu isti
             return false;

        //Znamo da objekat o instanca klase Covek tako da mozemo da ga kastujemo
        Covek c = ((Covek) o);
        if(ime.equals(c.getIme()) && prezime.equals(c.getPrezime()) && brojGodina == c.getBrojGodina())
            return true;
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Covek covek = (Covek) o;
        return brojGodina == covek.brojGodina && Objects.equals(ime, covek.ime) && Objects.equals(prezime, covek.prezime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, brojGodina);
    }
}
