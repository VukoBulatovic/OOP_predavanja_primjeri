package oop5.polimorfizam;

public class Elipsa extends Geometrija2D {

    private double a;
    private double b;

    public Elipsa(double a, double b) {
        super("Elipsa");
        if(a < b){
           double t = a;
            a = b;
            b = t;
        }
        this.a = a;
        this.b = b;
    }

    public Elipsa(String ime) {
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

    //Obim elipse nije resiv

    @Override
    public double povrsina(){
        return a*b*Math.PI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append("\n");
        sb.append("Stranice a i b : ").append(a).append(" ").append(b).append("\n");
        sb.append("Povrsina = ").append(povrsina());
        return sb.toString();
    }




}
