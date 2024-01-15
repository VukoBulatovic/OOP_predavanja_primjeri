package oop1.automobilv1;

public class TestAutomobila {

    public static void main(String[] args) {

        Automobil a1 = new Automobil("audi","quattro",'g',5,43323,2.2);
        Automobil a2 = new Automobil("honda","civic",'r',4,33422,2.0);

        System.out.println(a1.informacija());
        System.out.println(a1.daLiSuIsti(a2));

    }

}
