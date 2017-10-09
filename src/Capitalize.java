import java.util.Scanner;

public class Capitalize {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter your sentence: ");
      
      String sentence = input.nextLine();
     
      System.out.println(sentence.toUpperCase());
    }
}
