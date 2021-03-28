package Exception;

import java.util.Scanner;

public class Exp2 {

    public static void main(String[] args) {
        int count=1;
        while(count!=2)
        {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter first number : ");
                int num1 = input.nextInt();
                System.out.println("Enter second number : ");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result=" + num1 + "/" + num2 + "=" + result);
                count++;
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("You must enter integer please try again");
            }
        }
    }
}
