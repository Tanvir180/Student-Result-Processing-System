package Exercise;
import java.util.Scanner;
public class Taj5 
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     int n,i,s,j;
     System.out.print("Enter the number of question: ");
     n = input.nextInt();
     char ans[] = new char[n];
     System.out.print("Enter the answers : ");
     for(i=0;i<n;i++)
     {
         ans[i] = input.next().charAt(0);
     }
     System.out.print("Enter the number of students : ");
     s = input.nextInt();
     char ans2[][] = new char[s][n];
     int k[] = new int[s];
     System.out.println("Enter the answers of the student : ");
     for(i=0;i<s;i++)
     {
         k[i]=0;
         System.out.print("student "+i+"  ");
         for(j=0;j<n;j++)
         {
             ans2[i][j] = input.next().charAt(0);
         }
         for(j=0;j<n;j++)
         {
             if(ans2[i][j] == ans[j]) k[i]++;
         }
         if(k[i]>=7) {System.out.println("Excellent!!!");}
         else {System.out.println("Number of student "+i+" is "+k[i]);}
     }
     
     
    }
}
    

