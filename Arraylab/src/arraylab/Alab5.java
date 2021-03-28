
package arraylab;

import java.util.Scanner;
public class Alab5 {
     public static void main(String[] args) {
        int[] a;
        a= new int[20];
        int n,i,v,p;
        
 Scanner input =new Scanner (System.in);
      
        System.out.println("Enter the array size:");
        n=input.nextInt();
         System.out.println("Enter value");
         for( i=0;i<n;i++)
         {
             a[i]=input.nextInt();
         }
         System.out.println("New array is:");
    
    for (i =n-1; i >= 0; i--) 
             System.out.println(""+a[i]);
     }
}
