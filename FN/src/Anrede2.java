import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class Anrede2 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        out.println("Gebe Namen ein");
        String name = br.readLine();

        out.println("Gebe Gender ein");
        String Gender = br.readLine();


        if (Gender.equals("m")) {
            out.println("Hallo Herr " + name);
        } else if (Gender.equals("w")) out.println("Hallo Frau " + name);
        else if (Gender.equals("d")) {
            out.println("Hallo " + name);
        }


    }
}
