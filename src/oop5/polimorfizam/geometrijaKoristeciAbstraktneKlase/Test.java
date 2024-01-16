package oop5.polimorfizam.geometrijaKoristeciAbstraktneKlase;

public class Test {
    public static void main(String[] args) {

        Kvadrat k1 = new Kvadrat(5);
        System.out.println(k1);

        System.out.println("==============");

        Geometrija k2 = new Kvadrat(3);
        System.out.println(k2);

        System.out.println("==============");

        Kocka rubik = new Kocka(10);
        System.out.println(rubik);

        System.out.println("==============");

        Paralelopiped p = new Paralelopiped(2,3,4);
        System.out.println(p);

        System.out.println("==============");

        Geometrija pp = new Paralelopiped(2,3,4);
        System.out.println(pp);



    }
}
