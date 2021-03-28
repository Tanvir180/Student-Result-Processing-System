
package mamp3;

import java.util.Scanner;
public class Mamp3 {


    public static void main(String[] args) {
       int i=1,j=1,n,result=0;
        Scanner input =new Scanner(System.in);
           n=input.nextInt();
           while(i<=n)
           {
               result=result+j;
               j=i+j;
               i++;
           }
           System.out.println(result);
    }
}

