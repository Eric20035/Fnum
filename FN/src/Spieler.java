public class Spieler {
    private String name;
    private int alter;
    private int staerke;
    private int erfahrung;
    private int motivation;
    private int torschuss;
    private int tore;

    public Spieler(String name, int alter, int erfahrung, int motivation, int torschuss, int tore) {
        this.name = name;
        this.alter = alter;
        this.staerke=staerke;
        this.erfahrung = erfahrung;
        this.motivation = motivation;
        this.torschuss = torschuss;
        this.tore = tore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getErfahrung() {
        return erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getTore() {
        return tore;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }
    @Override public String toString() { String text = "Name: " + name; text = text + "\n\t" + ", Alter: " + alter; text = text + "\n\t" + ", Erfahrung: " + erfahrung; return text; }
}
