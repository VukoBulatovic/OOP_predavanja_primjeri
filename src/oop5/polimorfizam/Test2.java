package oop5.polimorfizam;

public class Test2 {

    //Zelim da preko metoda dohvatam obim  i povrsinu

    /*

    public double povrsina(Krug k){
        return k.povrsina();
    }

    public double povrsina(Elipsa e){
        return e.povrsina();
    }

    public double povrsina(Kvadrat k){
        return k.povrsina();
    }

    public double povrsina(Pravougaonik p){
        return p.povrsina();
    }

    */
    //Pisanje jednje iste metode ali sa razlicitim unosom je zapravo polimorfizam
    //a da ovo ne bi pisali rijesavamo na sl nacin

    public static double povrsina(Geometrija g){
        return g.povrsina();
    }


    public static void main(String[] args) {

    Kvadrat k = new Kvadrat(2);
    double povrsinaKvadrata = povrsina(k);
        System.out.println(povrsinaKvadrata);

    Krug kr = new Krug(5);
        System.out.println(povrsina(kr));



    }

}
