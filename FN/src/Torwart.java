public class Torwart extends Spieler {
    private int reaktion;


    public Torwart(String name, int alter, int erfahrung, int motivation, int torschuss, int tore) {
        super(name, alter, erfahrung, motivation, torschuss=0, tore=0);
        this.reaktion=reaktion;
    }

    @Override
    public String toString() {
        return "Torwart{" +
                "reaktion=" + reaktion +
                '}';
    }
}
