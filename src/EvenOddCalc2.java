/*Reads a complete line from input, sums only integers and 
discards other input tokens. Example run:
Δώστε τους αριθμούς: 
1 cat 2 fish 2.6    3	mouse 4
Άθροισμα περιττών 4
Άθροισμα άρτιων: 6
Πλήθος αριθμός που διαβάστηκαν: 4
*/

import java.util.Scanner;

public class EvenOddCalc2 {   
    public static void main(String args[])  {
        String numbers;
        int sum_even = 0, sum_odd = 0;
        int counter = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Δώστε τους αριθμούς: ");
        numbers = input.nextLine();
        input = new Scanner(numbers);
        
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                int number = input.nextInt();
                counter++;
                if (number % 2 == 0) {
                    sum_even += number;
                }
                else {
                    sum_odd += number;
                }
            }
            else {
                input.next(); //just used to advance scanner to next input
            }
        }
        
        System.out.println("Άθροισμα περιττών " + sum_odd);
        System.out.println("Άθροισμα άρτιων: " + sum_even);
        System.out.println("Πλήθος αριθμός που διαβάστηκαν: " + counter);
    }
    
}