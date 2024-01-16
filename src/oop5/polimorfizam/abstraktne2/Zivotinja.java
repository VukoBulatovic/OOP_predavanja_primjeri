package oop5.polimorfizam.abstraktne2;

public abstract class Zivotinja {

     private int brojNogu;
     private String naziv;

    public Zivotinja(int brojNogu, String naziv) {
        this.brojNogu = brojNogu;
        this.naziv = naziv;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public abstract void oglasiSe();


}
