package Exercise;
import java.util.Scanner;
public class Taj2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a[] = new int[101];
        int i,k=-1;
        for(i=0;i<101;i++) a[i]=0;
        System.out.print("Enter the integers between 1 and 100: ");
        while(k!=0)
        {
            k=input.nextInt();
            a[k]++;
        }
        for(i=1;i<101;i++)
        {
            if(a[i]!=0)
            {System.out.println(i+" occurs "+a[i]+"times");}
        }
        
    }
}
