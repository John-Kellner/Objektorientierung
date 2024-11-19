package listen;

public class Eintrag {

    private String vorname;
    private String nachname;
    private String nr;

    public Eintrag(String vorname, String nachname, String nr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.nr = nr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }


    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }
}
