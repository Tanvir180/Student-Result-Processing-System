
package algorithm;

import java.util.Scanner;
public class countingsort {
 
    
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter size of array: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Enter values: ");
        int a[] = new int[n];
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
            if(maxi<a[i])
                maxi = a[i];
        }
        int b[] = new int[maxi+1];
        int s[] = new int[n];
        for (int i=0;i<n;i++)
        {
            ++b[a[i]];
        }
        int idx=0;
        for(int i=0;i<maxi+1;i++)
        {
                int j=1;
                while(j<=b[i])
                {
                    s[idx] = i;
                    idx++;
                    j++;
                }
            
        }
        for(int i=0;i<n;i++)
            System.out.println(s[i]);
    }
}
   
