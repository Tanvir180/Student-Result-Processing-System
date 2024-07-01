package Try1;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i;
        System.out.println("Enter the Min:");
        
        i= input.nextInt();
        
        int d,y;
        d= i/1440;
        y= d/365;
        System.out.println("Year is :"+y);
        
        int d2;
        
        d2= d%365;
        System.out.println("Day is :"+d2);
        
    }
}
