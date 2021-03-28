package Exercise;

import java.util.Scanner;
public class Taj3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int n,i,j,temp;
        String k;
        System.out.print("Enter the number of students: ");
        n = input.nextInt();
        String s[] = new String[n]; 
        int a[] = new int[n];
        System.out.println("Enter student's name and Score:");
        for(i=0;i<n;i++)
        {
            s[i] = input.next();
            a[i] = input.nextInt();
        }
        for(i=1;i<=n-1;i++)
        {
           for(j=0;j<(n-i);j++)
           {
            if(a[j]<a[j+1])
                    {
                        temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                        k=s[j];s[j]=s[j+1];s[j+1]=k;
                    }
           }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(s[i]+"'s score is "+a[i]);
        }
    }
}
