
package contestmam2;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         
        while(input.hasNextInt())
         {
             int i = 1,sum=1;
         int n,flag=0;
             n=input.nextInt();
         while(i<=n)
         {
             
             if(i==n)
             {
                 flag++;
             }
             
             sum=sum+1;
             i=i+sum;
             
         }
         
         
         if(flag==0)
         {
             System.out.println("bad");
            
         }
         
         else
         {
               System.out.println(sum-1);
         }
    }
}
}