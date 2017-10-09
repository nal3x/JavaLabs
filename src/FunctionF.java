import java.util.Scanner;

public class FunctionF {
    public static void main(String[] args) {
       double x, f;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter value of x : ");
       x = input.nextDouble();
    	
       if (x < 0)   
            f = Math.pow(x, 3) + 3 * x - 3;
       else if (x <= 10)
            f = Math.pow(x, 3) + Math.pow(x, 2) + 1;
       else
            f = Math.sqrt(x) / x;
        
        System.out.println("Function f(x)  = " + f);
    }
}
