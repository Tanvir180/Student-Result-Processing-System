
package contestmam2;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n,x,y;
         n=input.nextInt();
          int i,j,k;
         int []a;
        a = new int [n];
         int []b;
         int flag=0;
        b = new int [n];
          x=input.nextInt();
         for( i=0;i<x;i++)
         {
             a[i]=input.nextInt();
         }
         y=input.nextInt();
         for( i=0;i<y;i++)
         {
             b[i]=input.nextInt();
         }
        
             
             for( j=1;j<=n;j++)
             {
                 if(j==a[j-1])
                 {
                     flag++;
                     break;
                 }
                
                 else if(j!=a[j-1])
                 {
                 for( k=0;k<y;k++)
                 {
                     if(j==b[k-1])
                     {
                         flag++;
                         break;
                     }
                 }
                 } 
                 System.out.println(flag);
             }
              
         
         if(flag==n)
         {
             System.out.println("I become the guy");
            
         }
         else
         {
              System.out.println("Oh, my keyboard");
         }
         System.out.println(flag);
    }
}
