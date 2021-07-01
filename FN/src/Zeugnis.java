import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Deutsch:");
		String input1= br.readLine();
		Double Deutsch=Double.parseDouble(input1);	  
		
		System.out.println("Mathe:"); 
		String input2=br.readLine();
		Double Mathe=Double.parseDouble(input2);
		
		System.out.println("RP:");
		String input3=br.readLine();
		Double RP=Double.parseDouble(input3);
		
		System.out.println("Der Durchschnitt ist ="+ (Deutsch+Mathe+RP)/3);
		System.out.println("Herzlichen Glückwunsch");

	}

}
