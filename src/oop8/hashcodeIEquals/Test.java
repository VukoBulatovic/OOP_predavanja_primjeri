package oop8.hashcodeIEquals;

public class Test {
    public static void main(String[] args) {

        Covek c1 = new Covek("a","a", 20);
        Covek c2 = new Covek("b","b",20);
        Covek c3 = new Covek("a","a", 25);
        Covek c4 = new Covek("a","a", 20);

        if(c1.equals(c4)){
            System.out.println("isti su");
        }
        System.out.println(c1.hashCode());
        System.out.println(c4.hashCode());

        System.out.println(c1.equals(c4));


    }
}
