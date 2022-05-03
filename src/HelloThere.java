import java.util.Scanner;

public class HelloThere {
  public static void main(String[] args) throws Exception {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Hello there! How are you doing today? ");
    String text = myScanner.nextLine();
    // System.out.println(text);

    System.out.println("Wow - Interesting! Tell me more about yourself!");
    String text2 = myScanner.nextLine();
    // System.out.println(text2);

    System.out.println("Nice chatting with you! Good Bye!");

  }

}
