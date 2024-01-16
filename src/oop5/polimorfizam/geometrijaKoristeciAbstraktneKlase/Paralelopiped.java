package oop5.polimorfizam.geometrijaKoristeciAbstraktneKlase;

public class Paralelopiped extends Geometrija3D {

    private double a;
    private double b;
    private double c;

    public Paralelopiped(double a, double b, double c) {
        super("Paralopiped");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double povrsina() {
        return 2*a*b + 2*a*c + 2*b*c;
    }

    @Override
    public double zapremina() {
        return a*b*c;
    }

}
