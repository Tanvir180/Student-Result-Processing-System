
package mamp6;

import java.util.Scanner;
public class Mamp6 {
    
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         int n,i,j=2,sum=0;
          System.out.println("Enter even numbers:");
           n=input.nextInt();
           System.out.println("Value Sum");
           for(i=1;i<=n;i++)
           {
               sum=sum+j;
               if(j<10)
                 System.out.println(j+"    "+sum);
               if(j>=10&&j<100)
                    System.out.println(j+"    "+sum);
               if(j>=100&&j<1000)
                    System.out.println(j+"    "+sum);
               j=j+2; 
           }
    }
    
}
