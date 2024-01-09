package statik;

public class TestAutomobila {

    public static void main(String[] args) {

        Automobil a1 = new Automobil("Audi","A4",'b',5,1000);
        Automobil a2 = new Automobil("Audi","A4",'b',5,1000);
        Automobil honda = new Automobil("Honda","Civic",'b',4,1200);


        System.out.println("sasija od a1 = " + a1.getBrojSasije());
        System.out.println("sasija od a2 = " + a2.getBrojSasije());
        System.out.println("sasija od honde = " + honda.getBrojSasije());

        //Interesuje me Koliko imam objekata klase:

        System.out.println("Broj objekata klase Automobil je : " + Automobil.getBrojObjekataOveKlase());



    }

}
