import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benutzer {

	public static void main(String[] args) throws IOException {
		System.out.println("Was ist dein Name und Vorname?");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String Vorname=br.readLine();
		String Nachname= br.readLine();
		String text = br.readLine();
	}

}
