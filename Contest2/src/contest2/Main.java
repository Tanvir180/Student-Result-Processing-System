
package contest2;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    
      String s;
     
     int x,f;
    
     f=input.nextInt();
     
     for(int i=0;i<=f;i++)
     {
         s=input.nextLine();
          x=s.length();
         if(x>10)
         {
            char k=s.charAt(0);
            char l=s.charAt(x-1);
             System.out.print(k);
             System.out.print(x-2);
             System.out.println(l);
         }
          else
         {
             System.out.println(s);
         }
         }
     }
    }
    



   