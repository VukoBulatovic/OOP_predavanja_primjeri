package oop4.softwareZaSkoluNasledjivanje.osobe1;

public class Profesor {

    private String ime;
    private String prezime;
    private int brojGodina;
    private double plata;

    public Profesor(String ime, String prezime, int brojGodina, double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
        this.plata = plata;
    }

    public Profesor() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime != null && !ime.isBlank())
         this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if(prezime != null && !prezime.isBlank())
         this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        if(brojGodina >= 0)
          this.brojGodina = brojGodina;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        if(plata >= 0)
         this.plata = plata;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append("\n");
        sb.append("broj godina: ").append(brojGodina).append("\n");
        sb.append("plata: ").append(plata);
        return sb.toString();
    }
}
