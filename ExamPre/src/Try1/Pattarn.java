
package Try1;

import java.util.Scanner;

public class Pattarn {
    public static void main(String[] args) {
        int i,j;
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++)
            {
               
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                    if(j==n){
                    System.out.println("");
                }
                           
                }
              
                else{
                    System.out.print(" ");
                }
            }
        }
    }
    
}
