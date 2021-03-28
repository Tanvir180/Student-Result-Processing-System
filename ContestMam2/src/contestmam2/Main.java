
package contestmam2;

import java.util.Scanner;
public class Main {
    
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
   //  char []a =new char[100];
     String []x =new String[100];
     int i,n,flag;
     n=input.nextInt();
     for(i=0;i<=n;i++)
     {
       
         x[i]=input.nextLine();
        
     }
     if(n<=16)
     {
         for(int j=0;j<=4;j++)
         {
         for(i=0;i<=n;i++)
         
     
         {
          
             System.out.printf(x[1]+": Happy \n" );
           
             System.out.printf(x[2]+": birthday \n" );
             System.out.printf(x[3]+": to \n" );
             System.out.printf(x[4]+": you \n" );
                     
         }
         }
     }
     
     }
     
}
