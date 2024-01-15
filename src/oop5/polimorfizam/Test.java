package oop5.polimorfizam;

public class Test {
    public static void main(String[] args) {

        Pravougaonik p = new Pravougaonik(2,3);
        System.out.println(p);
        System.out.println("================\n");

        Kvadrat k = new Kvadrat(10);
        System.out.println(k);
        System.out.println("================\n");

        Elipsa e = new Elipsa(3,4);
        System.out.println(e);
        System.out.println("================\n");

        Krug kr = new Krug(5);
        System.out.println(kr);
        System.out.println(kr.obim());

    }
}
