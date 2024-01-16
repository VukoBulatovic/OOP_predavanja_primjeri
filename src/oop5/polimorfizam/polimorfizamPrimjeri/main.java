package oop5.polimorfizam.polimorfizamPrimjeri;


    class PrvaKlasa {
        public void uradiNesto () {
            System.out.println("ja sam iz prve");
        }
    }

    class DrugaKlasa extends PrvaKlasa {
        public void uradiNesto() {
            System.out.println("ja sam iz druge");
        }
    }

    class TrecaKlasa extends PrvaKlasa {
        public void uradiNesto () {
            System.out.println("ja sam iz trece");
        }
    }




public class main {

    public static void main(String[] args) {

        PrvaKlasa aaa = new TrecaKlasa();
        aaa.uradiNesto();

        PrvaKlasa bbb = new DrugaKlasa();
        bbb.uradiNesto();

        System.out.println("=================");

        TrecaKlasa ttt = new TrecaKlasa();
        ttt.uradiNesto();




    }

}
