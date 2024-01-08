
public class Automobil {

//atributi

    private String marka;
    private String tip;
    private char boja; // g-green, b-blue...
    private int brojSedista;
    private int brojSasije;
    private double kubikaza;

//konstruktori

    public Automobil(String marka, String tip, char boja, int brojSedista, int brojSasije, double kubikaza) {
        this.marka = marka;
        this.tip = tip;
        this.boja = boja;
        this.brojSedista = brojSedista;
        this.brojSasije = brojSasije;
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
