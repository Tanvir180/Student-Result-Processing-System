
package Try1;
import java.util.Scanner;
public class Formatting {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
   
    
  // int a= input.nextInt();
   double a= input.nextDouble();
   double b= input.nextDouble();
    double c= Math.pow(a, b);
   // String S1 = Double.toString(c);
    
      //  System.out.println("Ans Is :"+s1);
        System.out.format("double : %.2f",c);
        System.out.println("Ans : "+ String.format("%.4f", c));
    }
   
    
    
}
