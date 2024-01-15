package oop3.automobilv2;


public class AutomobilV2 {

//atributi

    private String marka;
    private String tip;
    private char boja; // g-green, b-blue...
    private int brojSedista;
    private int brojSasije;
    private double kubikaza;
    public static int brojObjekataOveKlase = 0;

//konstruktori

    public AutomobilV2(String marka, String tip, char boja, int brojSedista, double kubikaza) {
        brojObjekataOveKlase++;
        this.marka = marka;
        this.tip = tip;
        this.boja = boja;
        this.brojSedista = brojSedista;
        this.brojSasije = brojObjekataOveKlase;
        this.kubikaza = kubikaza;
    }

    public AutomobilV2() {
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
        StringBuilder sb = new StringBuilder();  //na pocetku je sb prazan String ""
        sb.append("Marka: ").append(marka).append("\n");
        sb.append("Tip: ").append(tip).append("\n");
        sb.append("Boja: ").append(boja).append("\n");
        sb.append("brojSedista: ").append(brojSedista).append("\n");
        sb.append("brojSasije: ").append(brojSasije).append("\n");
        sb.append("Kubikaza: ").append(kubikaza).append("\n");

        return sb.toString();  //toString() -> je metoda koja vraca kreiran string iz StringBuildera
        //ovaj novi nacin se naziva serilizacija!


        //OVO JE STARI NACIN
        /*String ret = "";
        ret = ret + marka + "\n";
        ret = ret + tip + "\n";
        ret = ret + boja + "\n";
        ret = ret + brojSedista + "\n";
        ret = ret + brojSasije + "\n";
        ret = ret + kubikaza;
        return ret;*/
    }


    /*
    * Overloading (preopterecivanje) - postupak pisanja vise metoda sa razlicitim povratnom vrednoscu
    * Overriding (prepisivanje ili redefinisanje) - postupak ponovnog deifnisanja metode (da pregazi neku metodu)
    * */

    //OVO JE SERILIZACIJA (i sa override se pise)
    @Override // ova je anotacija, pomaze linkeru prilikom kompilacije programa ( uvezuje klase u jednu cjelinu )
                //moze i bez ovog da radi
    public String toString(){
        StringBuilder sb = new StringBuilder();  //na pocetku je sb prazan String ""
        sb.append("Marka: ").append(marka).append("\n");
        sb.append("Tip: ").append(tip).append("\n");
        sb.append("Boja: ").append(boja).append("\n");
        sb.append("brojSedista: ").append(brojSedista).append("\n");
        sb.append("brojSasije: ").append(brojSasije).append("\n");
        sb.append("Kubikaza: ").append(kubikaza).append("\n");

        return sb.toString();
    }




    public boolean daLiSuIsti(AutomobilV2 b){
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