package oop5.polimorfizam.geometrijaKoristeciAbstraktneKlase;

public abstract class Geometrija2D extends Geometrija{

    public Geometrija2D(String naziv) {
        super(naziv);
    }

    public abstract double obim();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Obim = ").append(obim());

        return sb.toString();
    }
}
