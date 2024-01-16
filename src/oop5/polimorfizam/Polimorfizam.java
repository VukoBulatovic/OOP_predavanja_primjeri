package oop5.polimorfizam;

public class Polimorfizam {

    /*
    Polimorfizam

    Polimorfizam nam omogucava da jedan objekat poprimi razlicite oblike

    postoje 3 tipa polimorfizma:

    1) Ad hoc
    -Polimorfizam koji nastaje tek u izvrsavanju kod-a
    (primer: method overloading) -
    ovaj primjer iz test2 klase kada se desava da jednom metodom mozemo unositi tipove

    2) Parametarski
    -Polimorfizam koji je realizovan preko generickih klasa(i metoda) u javi
    T identifikator; //- zadajemo genericki tip
    npr :
    public <T> T identickaFunkcija (T x){
      return x;
      }
      //ovo je kada ne znamo koji treba tip da proslijedimo pa mozemo napraviti bilo sta tipa "T"

    3) Podtipski (Subtyping)
    - Omogucava nam da jedan objekat ima rozliciti nominalni od izvedenog tipa
    NominalniTip identifikator = new IzvedeniTip(..);  //Uz to da je IzvedeniTip PODKLASA NominalnogTIpa
    -Ovakav objekat ce imati samo svojstva iz svog nominalnog tipa
    ali ce one biti realizovane preko izvedenog tipa

    * */

    public static void main(String[] args) {

        Geometrija a = new Geometrija("dada");
        Geometrija g = new Pravougaonik(2,2);
        System.out.println(a.povrsina());
        System.out.println(g.povrsina());






    }
}
