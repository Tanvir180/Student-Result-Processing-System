
package arraylab;
import java.util.Scanner;
public class Alab1 {
    public static void main(String[] args) {
        int[] a;
        a= new int[20];
        int sum=0,i,n;
        Scanner input =new Scanner (System.in);
       System.out.println("Enter the array size:");
        n=input.nextInt();
        System.out.println("Enter value");
         for( i=0;i<n;i++)
         {
             a[i]=input.nextInt();
         }
         for( i=0;i<n;i++)
         {
            sum=sum+a[i];
         }
         System.out.println("Sum is   "+sum);
    }
}
