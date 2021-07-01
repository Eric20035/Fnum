import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.text.ParseException;

public class ErsteWhileSchleife {


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie viel Kraftstoff wurde Verbraucht?");


        String input1= br.readLine();
        double verbrauch=Double.parseDouble(input1);
        System.out.println("Gefahrene Kilometer");
        String input2= br.readLine();
        double strecke=Double.parseDouble(input2);
         System.out.println("total Blöd");
         if (strecke<1&&verbrauch<1);
         System.out.println("gut");
         if (strecke>1&&strecke<2) {
             ;
             System.out.println(strecke>2&&verbrauch<1);
         } else {
             System.out.println("Neu Tanken");
         }


    }
    }


