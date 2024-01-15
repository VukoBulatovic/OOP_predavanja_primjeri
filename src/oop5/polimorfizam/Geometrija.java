package oop5.polimorfizam;
/*Geometrija
-povsina

Geometrija2D
-obim

1.Kvadrat
2.Pravougaonik
3.Krug
4.Elipsa
5.Trougao


Geometrija3D
-zapremina

6.Kocka
7.Kvadar
8.Prizma
8.Valjak
10.Lopta

* */
public class Geometrija {

    private String ime;

    public Geometrija(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double povrsina(){
        return -1;
    }


}
