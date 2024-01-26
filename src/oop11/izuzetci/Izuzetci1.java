package oop11.izuzetci;

public class Izuzetci1 {

    /*
    * Izuzetci/Greske
    *
    * 1. Greske u javi:
    * -Greske u javi su "sistemske greske"
    * -Greske u javi su neke greske samog sistema (npr greske JVM).
    *  -HeapMemoryLeak - ovo je jedna greska Java Virtuelne masine
    *
    * -Na greske ne mozemo da uticemo i kao takve ostavljamo ih neobradjene.
    * -Drugim recima, ako dodje do greske ZELIMO da nas kod PUKNE!
    *
    *
    *
    *
    * */

    public static void main(String[] args) {
        int[] x = {1,2,3};
        System.out.println(x[5]);


    }





}
