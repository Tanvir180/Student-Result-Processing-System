
package Recursion;

import java.util.Scanner;

public class Fibo {
    
    public static int fibonachi(int fibo)
    {
        int [] arr = new int[100];
        
        arr[0]=0;
        arr[1]=1;
        
        int i=0;
      // System.out.println(fibo);
        if(i<fibo){
            
               fibo = fibonachi(fibo-1) + fibonachi(fibo-2);
         
        }
        return fibo;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x;
        System.out.println("Enter any number: ");
        
        x = input.nextInt();
        
       int ans = fibonachi(x);
        
     //   System.out.println(ans);
        
    }
}
