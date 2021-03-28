package radixsort;
import java.util.*;
class RadixShort2{
 static int getMax(int arr[], int n) 
    { 
        int max = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
        return max; 
    } 

 static void countSort(int arr[], int n, int div) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        for (i = 0; i < n; i++) 
            count[ (arr[i]/div)%10 ]++;   //for placement
  
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1];    //Cumalative sum

        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/div)%10 ] - 1] = arr[i]; 
               count[ (arr[i]/div)%10 ]--; 
        } 
            for (i = 0; i < n; i++)
            {
                 arr[i] = output[i];    
            }                       
    }
    
     public static void main (String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size : "); 
        int n=input.nextInt();
        System.out.print("Enter the array  : "); 
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }        
        int m=getMax(arr,n);
        
        for (int div = 1; m/div > 0; div=div*10) 
            countSort(arr, n, div); 
        System.out.print("The sorted array is : ");    
             for (int i=0; i<n; i++) 
             {
              System.out.print(arr[i]+" ");                 
             } 
    } 
} 
  