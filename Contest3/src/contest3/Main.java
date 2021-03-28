
package contest3;

import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a;
        
         while(input.hasNextInt())
         {
              a=input.nextInt();
              if(a==0)
                 break;
             int value = 0;
             if(a<=100)
             value=91;
             else if(a>100)
              value=a-10; 
              PrintStream printf = System.out.printf("f91(%d) = %d\n",a,value); 
         }
    }
    
}
