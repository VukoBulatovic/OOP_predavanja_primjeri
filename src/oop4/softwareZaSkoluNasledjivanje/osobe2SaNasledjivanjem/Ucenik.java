package oop4.softwareZaSkoluNasledjivanje.osobe2SaNasledjivanjem;

public class Ucenik extends Osoba {

        private double prosek;

        public Ucenik(String ime, String prezime, int godine, double prosek){
            super(ime,prezime,godine);
            this.prosek = prosek;
        }

        public Ucenik(){
            super();
        }

        //Mozemo da mijesamo sad

            //prazan konstruktor za ucenika, ali pun za Osobu
        public Ucenik(String ime, String prezime, int brojGodina) {
            super(ime, prezime, brojGodina);
        }

            //pun konstruktor za Ucenika, ali prazan za Osobu
        public Ucenik(double prosek) {
            this.prosek = prosek;
        }


        //getteri i setteri


        public double getProsek() {
            return prosek;
        }

        public void setProsek(double prosek) {
            this.prosek = prosek;
        }

        /*
        Ostale gettere i settere smo nasledili od natkalse jer su oni sa public modifikatorom
        */

        // metode


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");   //prikupim uz pomoc super-a metodu toString
        sb.append("Prosek ucenika je: ").append(prosek);
        return sb.toString();
    }
}
