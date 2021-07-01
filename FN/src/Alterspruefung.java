import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie alt sind Sie?");
        String alter1 = br.readLine();

        int alter = Integer.parseInt(alter1);
        if ( alter>17){
            System.out.println("Its ok, she is old enough");
        }
        else  {
            System.out.println("SHES UNDERAGE");


        }
    }
}

































