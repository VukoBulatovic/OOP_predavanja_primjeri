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

    public Geometrija() {
    }

    public double povrsina(){
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Povrsina: ").append(povrsina());
        return sb.toString();
    }
}
