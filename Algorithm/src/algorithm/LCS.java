
package algorithm;

import java.util.Scanner;

public class LCS {
    
    static void lcs(String S1, String S2, int m, int n) {
    int[][] LCS_table = new int[m + 1][n + 1];
    
    
    // Building the mtrix in bottom-up way
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0)
          LCS_table[i][j] = 0;                             //In the table left column all value and top row all value put 0
        else if (S1.charAt(i - 1) == S2.charAt(j - 1))
          LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
        else
          LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
      }
    }
        System.out.println(LCS_table[m][n]);
    }
    
    
     public static void main(String[] args) {
    
        String str1, str2, LCS;  
          
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first sequence: ");  
        str1 = sc.nextLine(); //reads string.  
        System.out.print("Enter second sequence: ");  
        str2 = sc.nextLine(); //reads string.  
          
        int p = str1.length();  
        int q = str2.length(); 
        lcs(str1, str2, p, q);
  }
}
