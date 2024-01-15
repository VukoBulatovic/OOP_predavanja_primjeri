package oop4.softwareZaSkoluNasledjivanje.knjizaraZadatak;

public class Osoba {


    //atributi
    private String ime;
    private String prezime;
    private int brojGodina;

    //konstruktori


    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public Osoba() {
    }

    //getteri i setteri


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime != null && ime.equalsIgnoreCase(""))
         this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if(prezime != null && prezime.equalsIgnoreCase(""))
         this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        if(brojGodina >= 0)
         this.brojGodina = brojGodina;
    }

    //metode


    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(ime).append(" ").append(prezime).append("\n");
    sb.append("broj godina: ").append(brojGodina);
    return sb.toString();
    }


    public String imePrezime(){
        return ime + " " + prezime;
    }

}
