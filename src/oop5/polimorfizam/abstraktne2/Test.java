package oop5.polimorfizam.abstraktne2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Zivotinja> al = new ArrayList<>();
        al.add(new Pas("dzeki"));
        al.add(new Zmija());
        al.add(new Pas("zuca"));


        for (Zivotinja z : al) {
            z.oglasiSe();
        }

        System.out.println("=============");

        Zivotinja beznoga = new Zmija();
        beznoga.oglasiSe();




    }
}
