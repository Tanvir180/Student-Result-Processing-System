
package labp1;
import java.util.Scanner;

public class Labp1 {

    public static void main(String[] args) {
      
        System.out.println("Enter a number: ");
        int a,i,j,s=1;
        Scanner input =new Scanner(System.in);
        a=input.nextInt();
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                
                System.out.print(s+" `  ");
                    s=s+1;
            }
             System.out.println(" ");
        }
    }
    
}
