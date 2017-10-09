import java.util.Scanner;

public class EvenOddCalculator {   
    
    public static void main(String args[])  {    
	int number;
	int sum_even = 0, sum_odd = 0;
        int counter = 0; 

      Scanner input = new Scanner(System.in);
        
      System.out.println("Dwste akeraio arithmo :");
      number = input.nextInt();
      
      while (number !=0)    {
        counter++;
        
        if (number % 2 == 0)
            sum_even += number;
        else
            sum_odd += number;
            
        System.out.println("Dwste neo akeraio arithmo :");
        number = input.nextInt();
      }

        System.out.println("Athroisma monwn arithmwn: " + sum_even);
        System.out.println("Athroisma zigwn arithmwn:" + sum_odd);
        System.out.println("Plithos arithmwn pou diavastikan:" + counter);
        }
}
/*Mod: τροποποιήστε ώστε οι αριθμοί να διαβάζονται μια φορά από την είσοδο. 
Ο υπολογισμός πρέπει να σταματά όταν δεν υπάρχουν πλέον tokens σε αυτή.
*/