package oop5.polimorfizam;

public class Krug extends Elipsa {

    private double r;

    public Krug(double r) {
        super(r,r);
        this.r = r;
        setIme("Krug");
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obim(){
        return 2*r*Math.PI;
    }

}
