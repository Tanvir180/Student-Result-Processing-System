
package mamp4;

import java.util.Scanner;
public class Mamp4 {

    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       int x,y,i,result=1;
         System.out.println("Enter x and y");
         x=input.nextInt();
         y=input.nextInt();
         for(i=1;i<=y;i++)
         {
             result=result*x;
         }
            System.out.println(result);
    }
    
}
