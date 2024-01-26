package oop9.enumi;

public enum Enumi1 {

    /*
    * Enumerisani tipovi = nabrojivi tipovi
    *
    *
    * -Svako polje static i final
    * -Svako polje ima svoj konstruktor
    * -Konstruktor Enuma je privatan ==> ne mozemo imati objekte klase Enum
    * -Enum implicitno nasledjuje Enum<> klasu ==> enum ne moze da extenduje druge klase
    *
    * Posledica:
    *-Nista ne moze da nasledi Enum klasu (zato sto: privatan konstruktor!)
    *
    * Ovako izgleda Enum : ==>
    *
    * public enum <imeKlase> {
    *  POLJE1,
    *  POLJE2,
    *  ...,
    *  POLJEN;
    * }
    *
    * //metode
    *
    *   Ugradjene metode nad enumima:
    *
    * 1. .values() -> Enum[]    --vraca sve vrednosti tog enum-a
    * 2. .valueOf(String name) -> Enum     --vraca Enum u zavisnosti od njegovog imena
    *
    *
    *- Imena Enumerisanih tipova su Stringovna reprezentacija tog tipa
    * XYZ - "XYZ"
    *
    *
    *
    */





}
