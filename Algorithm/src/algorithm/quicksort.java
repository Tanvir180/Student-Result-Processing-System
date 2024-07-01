package algorithm;

import java.util.Scanner;

public class quicksort {
       int partition(int a[],int l, int h)
    {
        int pivot = a[l];
        int i=l;
        int j=h;
        while(j>i)
        {
           while(a[i]<=pivot)
           {
               i++;
               if(i==h)
                   break;
           }
           while(a[j]>pivot)
           {
               j--;
               if(j==l)
                   break;
           }
           if(j>i)
            {
               int s = a[i];
                a[i] = a[j];
                a[j] = s;
            }
        }
        int s = a[l];
        a[l] = a[j];
        a[j] = s;
       return j;
    }
   void quicksort(int a[],int l, int h)
    {
        if(l<h)
        {
          int  j = partition(a,l,h);
          quicksort(a,l,j-1);
          quicksort(a,j+1,h);
        }
    }
    
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter size of array: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
        }
       quicksort q = new quicksort();
       q.quicksort(a, 0, n-1);
       System.out.println("Sorted array:");
       for(int i=0;i<n;i++)
        {
           System.out.println(a[i]);
        }
    }
}
