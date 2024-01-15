package oop4.softwareZaSkoluNasledjivanje.knjizaraZadatak;

import java.util.ArrayList;

public class Knjiga {
    //atributi
    private String naziv;
    private int brojStanica;
    private double cena;
    private Autor autor;

    //konstruktori


    public Knjiga(String naziv, int brojStanica, double cena, Autor autor) {
        this.naziv = naziv;
        this.brojStanica = brojStanica;
        this.cena = cena;
        this.autor = autor;
    }

    public Knjiga() {
    }

    public Knjiga(String naziv, int brojStanica, double cena, String ime, String prezime, int brojGodina, ArrayList<Knjiga> knjigeKojeJeNapisao){
        this.naziv = naziv;
        this.brojStanica = brojStanica;
        this.cena = cena;
        this.autor = new Autor(ime,prezime,brojGodina,knjigeKojeJeNapisao);
    }

    //setteri i getteri


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanica() {
        return brojStanica;
    }

    public void setBrojStanica(int brojStanica) {
        this.brojStanica = brojStanica;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    //metode

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" -").append(autor.imePrezime()).append("\n");
        sb.append("cena: ").append(cena).append("\n");
        sb.append("broj stranica: ").append(brojStanica);
        return sb.toString();
    }

    public ArrayList<Knjiga> ostaleKnjigeKojeJeAutorNapisao(){
        ArrayList<Knjiga> al = new ArrayList<>();
        for (Knjiga k : autor.getKnjigeKojeJeNapisao()) {
            if(!k.getNaziv().equals(naziv))
                al.add(k);
        }
        return al;
    }









}
