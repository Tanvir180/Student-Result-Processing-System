package problem1;
import java.util.Scanner;
public class Problem1 {

    public static void main(String[] args) {
        int n,i=1,result=0;
     Scanner input =new Scanner(System.in);
     
        n=input.nextInt();
        if(n%2!=0)
            n=n-1;
        while(i<=n)
        {
            result=result+(i*(i+1));
            i=i+2; 
    }
        input.close();
        System.out.println(result);
    }
}
