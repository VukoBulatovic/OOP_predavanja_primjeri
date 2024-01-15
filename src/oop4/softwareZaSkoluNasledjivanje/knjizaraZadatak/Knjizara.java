package oop4.softwareZaSkoluNasledjivanje.knjizaraZadatak;

import java.util.ArrayList;

public class Knjizara {

    //atributi

    ArrayList<Knjiga> knjigeKojeSuNaStanju;
    ArrayList<Osoba> zaposleni;
    ArrayList<Autor> autoreKojeIzdaju;

    //kostruktori


    public Knjizara(ArrayList<Knjiga> knjigeKojeSuNaStanju, ArrayList<Osoba> zaposleni, ArrayList<Autor> autoreKojeIzdaju) {
        this.knjigeKojeSuNaStanju = knjigeKojeSuNaStanju;
        this.zaposleni = zaposleni;
        this.autoreKojeIzdaju = autoreKojeIzdaju;
    }

    public Knjizara() {
    }

    //getteri setteri


    public ArrayList<Knjiga> getKnjigeKojeSuNaStanju() {
        return knjigeKojeSuNaStanju;
    }

    public void setKnjigeKojeSuNaStanju(ArrayList<Knjiga> knjigeKojeSuNaStanju) {
        this.knjigeKojeSuNaStanju = knjigeKojeSuNaStanju;
    }

    public ArrayList<Osoba> getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(ArrayList<Osoba> zaposleni) {
        this.zaposleni = zaposleni;
    }



    public ArrayList<Autor> getAutoreKojeIzdaju() {
        return autoreKojeIzdaju;
    }

    public void setAutoreKojeIzdaju(ArrayList<Autor> autoreKojeIzdaju) {
        this.autoreKojeIzdaju = autoreKojeIzdaju;
    }


    //metode

    public double ukupnaCena(){
        double uc = 0;
        for(Knjiga k : knjigeKojeSuNaStanju)
            uc += k.getCena();
        return uc;
    }

    public ArrayList<Knjiga> knjigeOdAutora(Autor a){

        //da li imamo tog autora na stanju
        boolean nemamoAutora = true;
        for(Autor autorNaStanju : autoreKojeIzdaju){
            if(autorNaStanju.getIme().equalsIgnoreCase(a.getIme()) && autorNaStanju.getPrezime().equalsIgnoreCase(a.getPrezime()))
                nemamoAutora = false;
            break;
        }
        if(nemamoAutora)
            return null;



        ArrayList<Knjiga> al = new ArrayList<>();
        for(Knjiga k : knjigeKojeSuNaStanju){
            //pitamo se da li imamo knjigu sa istim imenom u al-u
            boolean vecJeUListi = false;
            for(Knjiga kl : al){
                if(kl.getNaziv().equalsIgnoreCase(k.getNaziv())){
                    vecJeUListi = true;
                    break;
                }
            }
            if(vecJeUListi)
                continue;


   ///ubacivanje kopije u niz
            for(Knjiga ka : a.getKnjigeKojeJeNapisao()){
                if(k.getNaziv().equalsIgnoreCase(ka.getNaziv())){
                    al.add(k);
                    break;
                }
            }
        }
        return al;

    }




    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Zaposleni:\n");
        for(Osoba z : zaposleni)
            sb.append(z.toString()).append("\n");
        sb.append("Knjige koje imamo: \n");
        for(Knjiga k : knjigeKojeSuNaStanju)
            sb.append(k.toString()).append("\n");
        sb.append("Autore koje izdajemo: \n");
        for (int i = 0; i < autoreKojeIzdaju.size() - 1; i++) {
            sb.append(autoreKojeIzdaju.get(i).imePrezime()).append("\n");
        }
        sb.append(autoreKojeIzdaju.get(autoreKojeIzdaju.size() - 1).imePrezime());

        return sb.toString();

    }












}
