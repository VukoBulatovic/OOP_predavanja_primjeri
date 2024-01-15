package oop3.automobilv2;

import java.util.ArrayList;

public class TestAutomobilaV2 {
    public static void main(String[] args) {

        AutomobilV2 a = new AutomobilV2("a","b",'c',2,3);

        /*
        * Kreiranjem
        * @Override
        * public String toString() {...}
        * metode, omogucavamo stampu ako napisemo samo identifikator naseg objekta, a java ce sama da pozove toString metod i da seriliziuje taj objekat
        * */

        System.out.println(a);

        //==================

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        System.out.println(al);  //Ovdje se poziva toString() metod iz klase ArrayList<>




    }
}
