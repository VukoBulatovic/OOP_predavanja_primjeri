package oop6.interfejsi;

public class Auto implements Pokretljivost {

    private String marka;

    public Auto(String marka) {
        this.marka = marka;
    }

    @Override
    public void pokreniSe() {
        System.out.println("Ja se krecem pomocu motora");
    }
}
