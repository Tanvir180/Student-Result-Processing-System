
package arraylab;
import java.util.Scanner;
public class Alab4 {
     public static void main(String[] args) {
        int[] a;
         a= new int[20];
        int n,i;
        int p;
        
 Scanner input =new Scanner (System.in);
      
        System.out.println("Enter the array size:");
        n=input.nextInt();
         System.out.println("Enter value");
         for( i=0;i<n;i++)
         {
             a[i]=input.nextInt();
         }
         
         System.out.println("Enter the position to delete:");
          p=input.nextInt();
        for(i=p-1;i<n;i++)
        {
            a[i]=a[i+1];
        }
        System.out.println("New array is:");
         for (i = 0; i < n-1; i++) 
             System.out.println(""+a[i]);
     }
}
