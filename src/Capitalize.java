import java.util.Scanner;

public class Capitalize {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Enter your sentence: ");  
      System.out.println(input.nextLine().toUpperCase());
          
      
    }
}

/*Mod 1: make each word of the capitalized sentence appear line by line
  
  Mod 2: scan for a specific word on the input and discard it on your output 
         or substitute it with equal number of # characters 
*/
