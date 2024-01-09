package statik;

public class Automobil {

//atributi

    private String marka;
    private String tip;
    private char boja; // g-green, b-blue...
    private int brojSedista;
    private int brojSasije;
    private double kubikaza;
    private static int brojObjekataOveKlase = 0;  //Ovo mu omogacava da kad napravimo neki objekat on ne ostaje na nuli nego pamti koliko je kreirano objekata i
                                                    // uvecava ga za 1 u konstruktoru

    //Staticki blok sluzi da se on prvo izvrsi, i on se izvrsava samo JEDNOM
    static {
        int x = 2;
        int y = 3;
        double nestoCudno = Math.log(x) / Math.log(y);
        brojObjekataOveKlase = (int) nestoCudno + 2;
    }


//konstruktori

    public Automobil(String marka, String tip, char boja, int brojSedista, double kubikaza) {
        brojObjekataOveKlase++;

        this.marka = marka;
        this.tip = tip;
        this.boja = boja;
        this.brojSedista = brojSedista;
        this.brojSasije = brojObjekataOveKlase;
        this.kubikaza = kubikaza;
    }

    public Automobil() {
    }

//getteri i setteri

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public char getBoja() {
        return boja;
    }

    public void setBoja(char boja) {
        this.boja = boja;
    }

    public int getBrojSedista() {
        return brojSedista;
    }

    public void setBrojSedista(int brojSedista) {
        this.brojSedista = brojSedista;
    }

    public int getBrojSasije() {
        return brojSasije;
    }

    public void setBrojSasije(int brojSasije) {
        this.brojSasije = brojSasije;
    }

    public double getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(double kubikaza) {
        this.kubikaza = kubikaza;
    }

    public static int getBrojObjekataOveKlase() {
        return brojObjekataOveKlase;
    }

    public static void setBrojObjekataOveKlase(int brojObjekataOveKlase) {
        Automobil.brojObjekataOveKlase = brojObjekataOveKlase;
    }

    //Metode


    public String informacija(){
        String ret = "";
        ret = ret + marka + "\n";
        ret = ret + tip + "\n";
        ret = ret + boja + "\n";
        ret = ret + brojSedista + "\n";
        ret = ret + brojSasije + "\n";
        ret = ret + kubikaza;
        return ret;
    }


    public boolean daLiSuIsti(Automobil b){
        if(this.marka.equalsIgnoreCase(b.marka)
                && this.tip.equalsIgnoreCase(b.tip)
                && this.boja == b.boja
                && this.brojSedista == b.brojSedista
                && this.brojSasije == b.brojSasije
                && this.kubikaza == b.kubikaza) {
            return true;
        }
        else return false;
    }

}
