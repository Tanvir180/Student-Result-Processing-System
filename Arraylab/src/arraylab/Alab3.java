
package arraylab;
import java.util.Scanner;

public class Alab3 {
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
        
         
         System.out.println("Enter the position to insert:");
          p=input.nextInt();
         System.out.println("Enter the position value :");
         
           v=input.nextInt();
           n++;  
    for (i = n; i >= p; i--) 
        a[i] = a[i - 1]; 
  
  
    a[p - 1] = v; 
  System.out.println("New array is:");
    
    for (i = 0; i < n; i++) 
             System.out.println(""+a[i]);
}
}
