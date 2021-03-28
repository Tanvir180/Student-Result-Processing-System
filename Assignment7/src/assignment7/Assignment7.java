package assignment7;
import java.util.Scanner;

public class Assignment7 {
public static void main(String[] args)
{
    int n;
    Scanner input = new Scanner(System.in);
    System.out.print("How Many Fractions? ");
    n=input.nextInt();
    Fraction F[]=new Fraction[n];
    for(int i=0;i<n;i++)
    {
        int x,y;
        System.out.print("Enter Fraction No. "+(i+1)+": ");
        x=input.nextInt();
        y=input.nextInt();
        F[i] = new Fraction(x,y);
    }
     for(int i=0;i<n;i++)
     {
        F[i].display(i+1);
     }
     for(int i=0;i<n;i++)
     {
         if(!F[i].isProper())
             System.out.println("is an improper fraction.");
             
     }
     for(int i=0;i<n-1;i++)
     {
         for(int j=i+1;j<n;j++)
         {
            if(F[i].isEquivalent(F[j]))
             {
                System.out.println(" are equivalent fractions.");
             }
         }
     }
}
    
}