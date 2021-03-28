
package Exercise;

import java.util.Scanner;
public class Taj1 
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    int n,i,m=0,k;
    System.out.print("Enter the number of students: ");
    n = input.nextInt();
    int a[] = new int[n];
    System.out.print("Enter "+n+" scores: ");
    for(i=0;i<n;i++)
    {
        a[i] = input.nextInt();
        if(m<a[i])
        {m = a[i];}
    }
    for(i=0;i<n;i++)
    {
        System.out.print("student "+i+" score is "+a[i]+" and grade is ");
        if(a[i] >= (m-10)) { System.out.println("A");}
        else if (a[i] >= (m-20)) { System.out.println("B");}
        else if(a[i] >= (m-30)) { System.out.println("C"); }
        else if(a[i] >= (m-40)) { System.out.println("D"); }
        else { System.out.println("F"); }
    }
    }
    
    
}
