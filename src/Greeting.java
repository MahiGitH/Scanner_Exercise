import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

          System.out.println("What is your name? ");
          String text = myScanner.nextLine();
          System.out.println("Hi " + text);
    }
}
