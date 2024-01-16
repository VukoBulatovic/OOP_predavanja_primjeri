package oop5.polimorfizam.geometrijaKoristeciAbstraktneKlase;

public abstract class Geometrija {

    private String naziv;

    public Geometrija(String naziv){
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public abstract double povrsina();


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append("\n");
        sb.append("Povrsina = ").append(povrsina());

        return sb.toString();
    }

}
