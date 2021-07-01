import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VersetzungordnungScratch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie viele Sechsen hast du?");
        int sechsen = Integer.parseInt(br.readLine());

        System.out.println("Wie viel fünfen hast du?");
        int fuenfen = Integer.parseInt(br.readLine());

        if(sechsen>1||sechsen==1&&fuenfen>1||fuenfen>3) {
            System.out.println("Probehalbjahr nicht bestanden!");
        }else if (sechsen==1&&fuenfen==1||fuenfen==3){
            System.out.println("Nicht Versetzt");
        }
        else System.out.println("Alles im Lot!");

        }










    }



