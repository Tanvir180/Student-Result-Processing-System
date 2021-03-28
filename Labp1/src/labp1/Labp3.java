
package labp1;
import java.util.Scanner;
public class Labp3 {
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");

        Scanner input =new Scanner(System.in);
        int a,i,j;
         a=input.nextInt();
           for(i=1;i<=a;i++)
        {
            for(j=1;j<=a-i;j++)
            {
                 System.out.print(" ");
               
            }
              for(int k=1;k<=i;k++)
              {
             System.out.print("*");
              }
            System.out.println();
        }
        
    }
    
}
