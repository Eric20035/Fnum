import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weather {
    public static String evaluateWeather ( double temperatur) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie viel Grad Celsius sind es Gerade");
        String grad = br.readLine();
        Double temperatur2 = Double.parseDouble(grad);
        if (temperatur2 > 22) {
            return "Das Wetter ist schön";
        } else return "Das Wetter ist nicht sio schön";
    }
    public static void main(String[] args) throws IOException {
        System.out.println(evaluateWeather(20));



        }


}
