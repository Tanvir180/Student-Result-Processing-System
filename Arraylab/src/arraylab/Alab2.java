
package arraylab;
import java.util.Scanner;
import java.util.Arrays;
public class Alab2 {
     public static void main(String[] args) {
        int[] a;
        int n;
                
 Scanner input =new Scanner (System.in);
      
        System.out.println("Enter the array size:");
        n=input.nextInt();
        a= new int[n];
        int i;
       
      
        System.out.println("Enter value");
         for( i=0;i<n;i++)
         {
             a[i]=input.nextInt();
         }
         
        Arrays.sort(a);
         System.out.println("Max is  "+a[n-1]);
         System.out.println("second Max is  "+a[n-2]);
    }
}
