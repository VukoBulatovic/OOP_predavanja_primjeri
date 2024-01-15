package oop4.softwareZaSkoluNasledjivanje.knjizaraZadatak;

import java.util.ArrayList;

public class Autor extends Osoba{

    //atributi

    private ArrayList<Knjiga> knjigeKojeJeNapisao;

    //konstruktori


    public Autor(String ime, String prezime, int brojGodina, ArrayList<Knjiga> knjigeKojeJeNapisao) {
        super(ime, prezime, brojGodina);
        this.knjigeKojeJeNapisao = knjigeKojeJeNapisao;
    }

    public Autor(ArrayList<Knjiga> knjigeKojeJeNapisao) {
        this.knjigeKojeJeNapisao = knjigeKojeJeNapisao;
    }

    //getteri i setteri


    public ArrayList<Knjiga> getKnjigeKojeJeNapisao() {
        return knjigeKojeJeNapisao;
    }

    public void setKnjigeKojeJeNapisao(ArrayList<Knjiga> knjigeKojeJeNapisao) {
        this.knjigeKojeJeNapisao = knjigeKojeJeNapisao;
    }

    //metode

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: ").append(super.toString()).append("\n");
        sb.append("knjige koje je napisao: ").append("\n");
        for (int i = 0; i < knjigeKojeJeNapisao.size() - 1; i++) {
            sb.append(knjigeKojeJeNapisao.get(i).getNaziv()).append("\n");
        }
        sb.append(knjigeKojeJeNapisao.get(knjigeKojeJeNapisao.size() - 1).getNaziv());

        return sb.toString();
    }

    public int brojKnjigaKojeJeNapisao(){
        return knjigeKojeJeNapisao.size();
    }


    public String ispisKnjiga(){
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < knjigeKojeJeNapisao.size() -1; i++) {
            sb.append(knjigeKojeJeNapisao.get(i).getNaziv()).append("\n");
        }
        sb.append(knjigeKojeJeNapisao.get(knjigeKojeJeNapisao.size() - 1).toString());
        return sb.toString();
    }





}
