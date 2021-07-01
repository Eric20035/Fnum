import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fuehrerschein {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie alt sind Sie?");
        String alter1 = br.readLine();

        int alter = Integer.parseInt(alter1);
        if (alter<14){

                System.out.println("Du darfst noch nicht Mofa fahren");

        }else  if (alter<16 && alter >14) {

            System.out.println("Du darfst Mofa fahren aber nicht Moped");
            if (alter<18&&alter>16 ){
                System.out.println("Du darfst Moped fahren, aber nochh nicht Auto");
            }
            if (alter>=18){
                System.out.println("Du darfst Auto fahren");

            }
             if (alter>17){
                System.out.println("Sie sind Volljährig");}

        }
    }

}
