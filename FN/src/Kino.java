




import java.io.IOException;



public class Kino {













    public static void main(String[] args) throws IOException {



        String[][] plaetze = erzeugenSaal();

        //printIntArray2d(plaetze);

        //abfragenIntArray2D(plaetze);

        abfragenIntArray2D (plaetze);





    }

    public static String[][] erzeugenSaal () throws IOException {

        System.out.println("Wie viele Reihen soll der Saal haben?");



        int anzahlZeilen = IO.readInteger();

        System.out.println("Wie viel Plätze soll der Saal haben?");

        int anzahlSpalten = IO.readInteger();

        String[][] erzeugenSaal = new String[anzahlZeilen][anzahlSpalten];





        for (int i = 0; i < erzeugenSaal.length; i++) {

            for (int j = 0; j < erzeugenSaal[i].length; j++) {



                erzeugenSaal[i][j] = "O";

                System.out.print( erzeugenSaal[i][j]+"\t");

            }

            System.out.println();

        }



        return erzeugenSaal;

    }



    public static void printIntArray2d (String[][]erzeugenSaal){

        for (int i = 0; i < erzeugenSaal.length; i++) {

            for (int j = 0; j < erzeugenSaal[i].length; j++) {

                System.out.print(erzeugenSaal[i][j] + "\t");

            }

            System.out.println("");

        }

    }

    public static void abfragenIntArray2D (String[][]erzeugenSaal) throws IOException {

        System.out.println("In welcher Reihe soll der Platz reserviert werden?");

        int k = IO.readInteger()-1;

        System.out.println("Welcher Platz soll reserviert werden?");

        int f = IO.readInteger()-1;

        erzeugenSaal[k][f]="X";









        for (int i = 0; i < erzeugenSaal.length; i++) {

            for (int j = 0; j < erzeugenSaal[i].length; j++) {

                System.out.print(erzeugenSaal[i][j] + "\t");

            }

            System.out.println("");

        }







    }



}

