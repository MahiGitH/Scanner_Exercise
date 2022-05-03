import java.util.Scanner;

public class Superhero {
  public static void main(String[] args) throws Exception {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Let's write a story about a superhero.");

    System.out.println("Who is the hero of our story?");
    String text = myScanner.nextLine();
    System.out.println(text);

    System.out.println("What is their superpower?");
    String text2 = myScanner.nextLine();
    System.out.println(text2);

    System.out.println("Here is the story:");

    System.out.println("There once was a superhero named " + text + ", " + "who had the power of " + text2 + ".");
    System.out.println("As they grew older, " + text + " saw that the world needed them.");
    System.out.println(text + " used their ability to " + text2 + " to save the world.");

  }
}
