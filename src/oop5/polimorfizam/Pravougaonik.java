package oop5.polimorfizam;

public class Pravougaonik extends Geometrija2D {

    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        super("Pravougaonik: ");
        this.a = a;
        this.b = b;
    }

    public Pravougaonik(String ime) {
        super(ime);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double povrsina(){
        return a * b;
    }

    @Override
    public double obim(){
        return 2*a + 2*b;
    }

    private String formatirajStranice(){
        if(a != b)
            return "Stranice: " + a + " " + b;
        else return "Stranica: " + a;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append("\n");
        sb.append(formatirajStranice()).append("\n");
        sb.append("Obim = ").append(obim()).append("\n");
        sb.append("Povrsina = ").append(povrsina());
        return sb.toString();
    }
}
