package input1;
import java.util.Scanner;
public class Input1 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x;
        double y;
        String z;
        System.out.println("Enter int number:");
        x=input.nextInt();
        System.out.println(x);
        System.out.println("Enter double number:");
        y=input.nextDouble();
        System.out.println(y);
        
         //Scanner input=new Scanner(System.in);
      System.out.println("Enter string:");
        z=input.nextLine();
        System.out.println(z);
    }
 
}
