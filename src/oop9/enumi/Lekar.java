package oop9.enumi;

public class Lekar {

    private String ime;
    private int brojGodina;
    //lista pacijenata //TODO;
    private TipoviLekara uzaSpecijalizacija;

    public Lekar(String ime, int brojGodina, TipoviLekara uzaSpecijalizacija) {
        this.ime = ime;
        this.brojGodina = brojGodina;
        this.uzaSpecijalizacija = uzaSpecijalizacija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    public TipoviLekara getUzaSpecijalizacija() {
        return uzaSpecijalizacija;
    }

    public void setUzaSpecijalizacija(TipoviLekara uzaSpecijalizacija) {
        this.uzaSpecijalizacija = uzaSpecijalizacija;
    }










}
