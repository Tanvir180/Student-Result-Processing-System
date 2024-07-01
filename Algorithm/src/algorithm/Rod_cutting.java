
package algorithm;

import java.util.Scanner;


public class Rod_cutting {
      public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
          System.out.println("Enter Number of Product: ");
        int n=s.nextInt();
          System.out.println("Enter total Size");
        int size=s.nextInt();
        int[] price=new int[n];
          System.out.println("Enter Profit: ");
        for (int i = 0; i < n; i++) {
            price[i]=s.nextInt();
        }
        rod(price,n,size);
    }
    public static void rod(int[] price,int n,int s) {
        int[][] table=new int[s+1][s+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= s; j++) {
                if(i==0||j==0){
                    table[i][j]=0;
                }
                else if(i<=j){
                    table[i][j]=Integer.max(table[i-1][j],(price[i-1]+table[i][j-i]));
                }
                else
                    table[i][j]=table[i-1][j];
            }
        }
        System.out.println(table[n][s]);
    }
}
