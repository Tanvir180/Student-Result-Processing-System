
package Recursion;



import java.util.Scanner;

public class Fact {
    
    public static int factorial(int fact)
    {
        System.out.println(fact);
        if(fact>1)
               fact = fact*factorial(fact-1);
         
 
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x;
        System.out.println("Enter any number: ");
        
        x = input.nextInt();
        
       int ans = factorial(x);
        
        System.out.println(ans);
        
    }
    
}
