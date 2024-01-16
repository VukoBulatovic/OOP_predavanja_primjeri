package oop5.polimorfizam.geometrijaKoristeciAbstraktneKlase;

public class Pravougaonik extends Geometrija2D {

    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        super("Pravougaonik");
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double obim() {
        return 2*a + 2*b;
    }

}
