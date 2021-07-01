import java.io.BufferedReader;
import java.io.IOException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Klassenarbeit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie ihren Wert für q an");
        Double q=Double.parseDouble(br.readLine());
        System.out.println("Geben sie ihren Wert für p ein");
        Double p =Double.parseDouble(br.readLine());
        double  d1=(p/2);
        double d2=(Math.pow(d1,2)-q);

    }
}
