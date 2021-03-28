
package mamp5;
import java.util.Scanner;
public class Mamp5 {

    public static void main(String[] args) {
       int n,sum=0,k=0,avg=0;
       Scanner input =new Scanner(System.in);
       n=input.nextInt();
       while(n!=9999)
       {
           sum=sum+n;
           k++;
           n=input.nextInt();
           
       }
       avg=sum/k;
        System.out.println("Avg="+avg);
        input.close();
    }
    
}
