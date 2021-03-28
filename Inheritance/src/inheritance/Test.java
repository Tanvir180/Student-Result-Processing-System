
package inheritance;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Teacher ob1 =new Teacher();
       
         System.out.println("Enter name");
        ob1.name=input.nextLine();
         System.out.println("Enter age");
        ob1.age=input.nextInt();
         System.out.println("Enter Qualification");
        ob1.qualification=input.next();
        ob1.display2();
    }
}
