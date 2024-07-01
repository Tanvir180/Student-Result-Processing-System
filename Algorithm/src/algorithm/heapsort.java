
package algorithm;

import java.util.Scanner;
import java.lang.Math;
public class heapsort {
   
    void maxheapify (int a[],int n,int i)
    {
        int largest = i;
        int l = (2*i)+1;
        int r = (2*i)+2;
        if(l<n && a[l]>a[largest])
        {
            largest = l;
        }
        if(r<n && a[r]>a[largest])
        {
            largest = r;
        }
        if(largest!=i)
        {
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
            maxheapify(a,n,largest);
        }
    }
    void heapsort(int a[],int n)
    {
       for(int i =(n/2)-1;i>=0;i--)
       {
           maxheapify(a,n,i);
       }
       for(int i = n-1;i>=0;i--)
       {
           int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            maxheapify(a,i,0);
       }
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter size of array: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Enter values: ");
        int a[] = new int[n];
        for(int i =0;i<n;i++)
        {
            a[i] = input.nextInt();
        }
        heapsort h = new heapsort();
        h.heapsort(a,n);
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}

