package oop7.Interfejsi2;

import java.util.LinkedList;

public interface Interfejsi2 {







    /*
    * -Interfejsi ne mogu imati konstruktore
    * -Interfejsi mogu da imaju i implementacije metoda
    * -Takve metode se nazivaju default metode
    *  default <tipPovratneVrednosti> <imeMetode> (<argumenti>) { .. }
    * */
    default void implementiranaMetoda(){
        System.out.println("...");
    }

    /*Ove default ce se izvrsiti npr kad imam neke druge klase u kojima jos ne znam kako cu da rijesim ovu implementiranaMetoda(){}
    * pa zbog toga stavim je u interfejs kao default i tjt..*/

    /*privatne metode/promenljive
    * -sluze nam kao i pomocne metode
    *  */

    private void f(){
        //....
    }









}
