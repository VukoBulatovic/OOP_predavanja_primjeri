package oop9.enumi;

import java.util.Arrays;

public class TestLekari {
    public static void main(String[] args) {

        Lekar l1 = new Lekar("Nada Macura", 30, TipoviLekara.OPSTE_PRAKSE);
        System.out.println(l1.getUzaSpecijalizacija());
        System.out.println(TipoviLekara.valueOf("UROLOG"));
        System.out.println(Arrays.toString(TipoviLekara.values()));














    }
}
