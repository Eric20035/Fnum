import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;

    public void Mannschaft (String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe){
        this.name=name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe= spielerListe;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }
    public int getMotivation() {
       int summe=0;
       for (int i=0;i<spielerListe.size();i++){
          Spieler spieler=this.spielerListe.get(i);
          summe+=spieler.getMotivation();
       }
       return summe;
    }
    public int getStaerke() {
        int summe=0;
        for (int i=0;i<spielerListe.size();i++){
            Spieler spieler=this.spielerListe.get(i);
            summe+=spieler.getStaerke();
        }
        return summe;
    }
}
