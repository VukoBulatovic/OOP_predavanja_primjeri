package oop5.polimorfizam.abstraktne2;

public class Pas extends Zivotinja {

    private String nadimak;

    public Pas(String nadimak){
        super(4,"Pas");
        this.nadimak = nadimak;
    }

    public String getNadimak() {
        return nadimak;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    @Override
    public void oglasiSe(){
        System.out.println("woof woof");
    }


}
