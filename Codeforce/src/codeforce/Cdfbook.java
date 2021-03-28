
package codeforce;
import java.util.Scanner;

public class Cdfbook {
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
    int n;
    double ans;
   n=input.nextInt();
   double []a =new double[100];
   // double a[101];
    double sum=0;
    for(int i=0;i<n;i++)
    {
       a[i]=input.nextInt();

    }
    for(int i=0;i<n;i++)
    {
        sum=sum+a[i];
    }
    ans=(sum/n);
        System.out.println(ans);
}

}