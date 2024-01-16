package oop6.interfejsi;

public class Interfejsi {

    /*zbog problema sto jedna klasa ne moze da naslijedi 2 roditeljske mi uvodimo pojam interfejsa*/

    /*
    Interfejs je abstraktna klasa sa svim javnim abstraktnim metodama
    i sa svim javnim statickim FINALNIM promenljivima

    - interfejs je klasa koja skuplja u jednu logicku celinu sve metode koje se ticu jedne "oblasti"

    public interface <identifikator> {
            ....
    }

    -Kod interfejsa ne moramo da navodimo reci public i abstract za metode
    public abstract void f(); --> void f();

    -Kod interfejsa ne moramo da navodimo kljucne reci public, static i final za promenljive
    public static final x;  --> int x;

    -Posto se interfejs ponasa kao abstraktna klasa, ona NE MOZE biti izveden tip
    vec mora biti Nominalni tip.

    -(Neiterfejsne) klase IMPLEMENTUJU interfejs, pomocu kljuce reci implements

    -Jedan interfejs prosiruje drugi interfejs (extends)

    Interface I;
    Class A;
    Class A implements I;

    Interface I2;
    Interface I2 extends I;

    - Jedna klasa moze da implementuje vise interfejsa
    Class A implements I1, I2, ... {}

    -Putem interfejsa moze da realizujemo dijamantsku strukturu
    */



}
