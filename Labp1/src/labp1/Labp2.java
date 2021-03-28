
package labp1;
import java.util.Scanner;

public class Labp2 {
    public static void main(String[] args) {
         System.out.println("Enter a number: ");

        Scanner input =new Scanner(System.in);
        int a,i,j,s=1;
         a=input.nextInt();
           for(i=a;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                
                System.out.print("*");
               
            }
             System.out.println(" ");
        }
    }
}
