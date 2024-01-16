package oop5.polimorfizam.geometrijaKoristeciAbstraktneKlase;

public abstract class Geometrija3D extends Geometrija {

    public Geometrija3D(String naziv) {
        super(naziv);
    }

    public abstract double zapremina();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Zapremina = ").append(zapremina());

        return sb.toString();
    }






}
