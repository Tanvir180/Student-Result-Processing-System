

import java.util.Scanner;
public class Main {
 public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
    int n;
    int f1=0,f2=0;
     n=input.nextInt();
    String []x =new String[n+1];
     for(int i=0;i<=n;i++)
     {
         x[i]=input.nextLine();
         if(x[i].equals("A"))
         {
             f1++;
         }
         else if(x[i].equals("D"))
         {
             f2++;
         }
     }
     if(f1<f2)
     {
         System.out.println("Danik");
     }
     else if(f1>f2)
     {
         System.out.println("Anton");
     }
     else
     {
         System.out.println("Friendship");
     }
}
}