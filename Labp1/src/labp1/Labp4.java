
package labp1;

import java.util.Scanner;
public class Labp4 {
     public static void main(String[] args) {
         System.out.println("Enter a number: ");

        Scanner input =new Scanner(System.in);
        int a,i,j,s=1;
         a=input.nextInt();
           for(i=1;i<=a;i++)
        {
            for(j=1;j<=a;j++)
            {
                if (j==1||j==a||i==1||i==a)
                {
                System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
             System.out.println(" ");
        }
            
}
}
