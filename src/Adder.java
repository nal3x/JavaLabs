import java.util.Scanner;

public class Adder {
public static void main(String[] args) {
      int number1, number2;
      int result;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter first integer : ");
      number1 = input.nextInt();
    	
      System.out.print("Enter second integer : ");
      number2 = input.nextInt();
      
      result = number1 + number2;
      System.out.println("Sum is  : " + result );
    }
}

/*Modify and create Capitalize.java, a class that parses input as a String, and
prints the sentence capitalized. See Scanner and String class for appropriate 
methods. 
*/
