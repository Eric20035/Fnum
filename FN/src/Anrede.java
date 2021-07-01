import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Gebe Namen ein");
		String name = br.readLine();

		System.out.println("Gebe Gender ein");
		String Gender = br.readLine();
		int gender = Integer.parseInt(Gender.trim());


			if (gender == 1) {
				System.out.println("Hallo Herr " + name);

			}
			else if (gender==2) {
				System.out.println("Hallo Frau " + name);
			}
			else if (gender==3) {
				System.out.println("Hallo " + name);
			}



	}


}
