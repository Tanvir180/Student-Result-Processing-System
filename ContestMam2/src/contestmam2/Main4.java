
package contestmam2;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n,flag=0;
         n=input.nextInt();
         int []a;
        a = new int [n];
         for(int i=0;i<n;i++)
         {
             a[i]=input.nextInt();
         }
         for(int i=0;i<n;i++)
         {
             if(a[i]==1)
             {
                 flag++;
                 break;
             }
         }
         if(flag==0)
         {
             System.out.println("EASY");
         }
         else
         {
             System.out.println("HARD");
         }
    }
}
