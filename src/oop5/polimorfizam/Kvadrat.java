package oop5.polimorfizam;

public class Kvadrat extends Pravougaonik {

    private double a;

    public Kvadrat(double a){
        super(a,a);
        this.a =a;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }




}
