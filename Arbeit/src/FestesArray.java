import java.io.IOException;

public class FestesArray {
    public static void main(String[] args) throws IOException {
        double []zahlen= new double [5];
        for (int i=0; i<zahlen.length; i++) {
            System.out.println("gib eine zahl an");
            zahlen[i] = IO.readDouble();
        }
        for (int i =0;i<zahlen.length; i++) {
            System.out.println(zahlen[i]);

        }
    }
}
